package pl.hornunge.creational.prototype.person;

import pl.hornunge.creational.prototype.person.brain.Brain;

import java.util.StringJoiner;

public class Person implements Cloneable {

    private final Brain brain;
    private int age;

    public Person(Brain brain, int age) {
        this.brain = brain;
        this.age = age;
    }

    //This constructor is not necessary, it's used to avoid code duplication in subclasses.
    protected Person(Person another) throws CloneNotSupportedException {
        this.brain = another.brain.clone(); //deep copy
        this.age = another.age;
    }

    public Person clone() throws CloneNotSupportedException {
        return new Person(this);
        //without copy constructor I could simply do:
        //return new Person(brain.clone(), age);
    }

    //getters are here only to be used in toString method of subclasses
    protected Brain getBrain() {
        return brain;
    }

    protected int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", classNameWithIdHashCode() + "[", "]")
                .add("brain = " + brain)
                .add("age = " + age).toString();
    }

    protected String classNameWithIdHashCode(){
        return String.format("%s@%s", getClass().getSimpleName(), idHashCodeAsHex());
    }

    private String idHashCodeAsHex(){
        return Integer.toHexString(System.identityHashCode(this));
    }

}

package pl.hornunge.creational.prototype.person;

import pl.hornunge.creational.prototype.person.brain.Brain;

import java.util.StringJoiner;

public class SkilledPerson extends Person {
    private final String skill;

    public SkilledPerson(Brain brain, int age, String skill) {
        super(brain, age);
        this.skill = skill;
    }

    private SkilledPerson(SkilledPerson another) throws CloneNotSupportedException {
        super(another); //deep copy of all fields in super type(s)
        this.skill = another.skill;
    }

    public SkilledPerson clone() throws CloneNotSupportedException {
        return new SkilledPerson(this);
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", classNameWithIdHashCode() + "[", "]")
                .add("brain = " + getBrain())
                .add("age = " + getAge())
                .add("skill = " + skill)
                .toString();
    }
}

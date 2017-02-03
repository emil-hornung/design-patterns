package pl.hornunge.creational.prototype;

import pl.hornunge.creational.prototype.person.Person;
import pl.hornunge.creational.prototype.person.SkilledPerson;
import pl.hornunge.creational.prototype.person.brain.Brain;
import pl.hornunge.creational.prototype.person.brain.SmartBrain;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person(new Brain(80), 30);
        Person person1Clone = person1.clone();
        Person person2 = new SkilledPerson(new Brain(110), 33, "some skill");
        Person person2Clone = person2.clone();

        System.out.println(person1);
        System.out.println(person1Clone);
        System.out.println(person2);
        System.out.println(person2Clone);
    }
}

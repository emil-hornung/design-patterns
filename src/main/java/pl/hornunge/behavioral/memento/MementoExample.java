package pl.hornunge.behavioral.memento;

import java.util.Date;

public class MementoExample {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"John", "Smith", "Sales");
        System.out.println(employee);
        
        EmployeeMementoCaretaker caretaker = new EmployeeMementoCaretaker();
        caretaker.saveSnapshot("Snapshot 1", employee.createMemento());
        System.out.println(caretaker.getSnapshot("Snapshot 1"));

        employee.setLastName("No longer Smith");
        caretaker.saveSnapshot("Snapshot 2", employee.createMemento());

        employee.setDepartmentName("Marketing");
        System.out.println("Employee after final changes: " + employee);

        employee.restoreFromMemento(caretaker.getSnapshot("Snapshot 1"));
        System.out.println("Employee restored to snapshot 1: " + employee);

        employee.restoreFromMemento(caretaker.getSnapshot("Snapshot 2"));
        System.out.println("Employee restored to snapshot 2: " + employee);

    }
}

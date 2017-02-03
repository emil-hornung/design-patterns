package pl.hornunge.behavioral.memento;

import java.util.StringJoiner;

public class EmployeeMemento {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final String departmentName;

    public EmployeeMemento(long id, String firstName, String lastName, String departmentName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("id = " + id)
                .add("firstName = " + firstName)
                .add("lastName = " + lastName)
                .add("departmentName = " + departmentName).toString();
    }
}

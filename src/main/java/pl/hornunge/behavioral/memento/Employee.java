package pl.hornunge.behavioral.memento;

import java.util.StringJoiner;

public class Employee {

    /*
    This example is simple as it has only primitive or immutable fields.
    In case of mutable fields, one should use deep copies of fields - by invoking some copy method on the field.
    One way might be to use clone() method (and Cloneable interface) alongside protected copy constructor.
     */
    private long id;
    private String firstName;
    private String lastName;
    private String departmentName;

    public Employee(long id, String firstName, String lastName, String departmentName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
    }

    public EmployeeMemento createMemento() {
        return new EmployeeMemento(id, firstName, lastName, departmentName);
    }

    public void restoreFromMemento(EmployeeMemento employeeMemento) {
        id = employeeMemento.getId();
        firstName = employeeMemento.getFirstName();
        lastName = employeeMemento.getLastName();
        departmentName = employeeMemento.getDepartmentName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

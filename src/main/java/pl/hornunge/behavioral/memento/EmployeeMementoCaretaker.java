package pl.hornunge.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMementoCaretaker {
    private Map<String, EmployeeMemento> snapshots= new HashMap<>();

    public void saveSnapshot(String name, EmployeeMemento employeeMemento){
        snapshots.put(name,employeeMemento);
    }

    public EmployeeMemento getSnapshot(String name){
        return snapshots.get(name);
    }
}

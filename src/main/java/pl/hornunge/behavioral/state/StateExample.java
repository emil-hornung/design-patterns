package pl.hornunge.behavioral.state;

import pl.hornunge.behavioral.state.gumball_machine.DefaultGumballMachine;
import pl.hornunge.behavioral.state.gumball_machine.GumballMachine;

public class StateExample {
    public static void main(String[] args) {
        GumballMachine machine = DefaultGumballMachine.newInstance();
        printMachine(machine);

        System.out.println("---Basic scenario---");
        machine.insertQuarter();
        machine.turnCrank();
        printMachine(machine);

        System.out.println("---Ejecting inserted coin---");
        machine.insertQuarter();
        printMachine(machine);
        machine.ejectQuarter();
        printMachine(machine);

        System.out.println("---Some forbidded operations---");
        machine.turnCrank();
        machine.ejectQuarter();
        machine.insertQuarter();
        machine.insertQuarter();


        System.out.println("---Emptying and refilling---");
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        printMachine(machine);
        machine.refill(10);
        printMachine(machine);

    }

    private static void printMachine(GumballMachine machine) {
        System.out.println(machine);
    }
}

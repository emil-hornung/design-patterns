package pl.hornunge.behavioral.state.gumball_machine;

public class OutOfGumballsState implements GumballMachineState {

    private final DefaultGumballMachine machine;

    public OutOfGumballsState(DefaultGumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumballs left.");
    }

    @Override
    public void turnCrank() {
        System.out.println("No gumballs left.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarters inserted - nothing to eject.");
    }

    @Override
    public void refill(int quantity) {
        System.out.println("Refilling the machine.");
        machine.doRefill(quantity);
        machine.setNoQuarterState();
    }

    @Override
    public String toString() {
        return "OutOfGumballs";
    }

}

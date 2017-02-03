package pl.hornunge.behavioral.state.gumball_machine;

public class NoQuarterState implements GumballMachineState {

    private final DefaultGumballMachine machine;

    public NoQuarterState(DefaultGumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted.");
        machine.doInsertQuarter();
        machine.setHasQuarterState();
    }

    @Override
    public void turnCrank() {
        System.out.println("No quarters inserted - can't dispense.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarters inserted - nothing to eject.");
    }

    @Override
    public void refill(int quantity) {
        System.out.println("Refilling the machine.");
        machine.doRefill(quantity);
    }

    @Override
    public String toString() {
        return "NoQuarter";
    }

}

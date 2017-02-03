package pl.hornunge.behavioral.state.gumball_machine;

public class HasQuarterState implements GumballMachineState {

    private final DefaultGumballMachine machine;

    public HasQuarterState(DefaultGumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter already inserted.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Dispensing a gumball.");
        machine.dispenseGumball();
        if (machine.noGumballs()){
            machine.setOutOfGumballsState();
        }else{
            machine.setNoQuarterState();
        }
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting quarter.");
        machine.doEjectQuarter();
        machine.setNoQuarterState();
    }

    @Override
    public void refill(int quantity) {
        System.out.println("Refilling the machine.");
        machine.doRefill(quantity);
    }

    @Override
    public String toString() {
        return "HasQuarter";
    }
}

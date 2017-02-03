package pl.hornunge.behavioral.state.gumball_machine;

import static com.google.common.base.Preconditions.*;

public class DefaultGumballMachine implements GumballMachine{
    private int quartersCounter = 0;
    private int gumballsCounter = 3;

    private GumballMachineState noQuarterState;
    private GumballMachineState hasQuarterState;
    private GumballMachineState outOfGumballsState;

    private GumballMachineState currentState;

    private DefaultGumballMachine() {
    }

    public static DefaultGumballMachine newInstance(){
        DefaultGumballMachine defaultGumballMachine = new DefaultGumballMachine();
        defaultGumballMachine.initStates();
        return defaultGumballMachine;
    }

    private void initStates(){
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        outOfGumballsState = new OutOfGumballsState(this);

        currentState = noQuarterState;
    }

    @Override
    public void insertQuarter(){
        currentState.insertQuarter();
    }

    @Override
    public void turnCrank(){
        currentState.turnCrank();
    }

    @Override
    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    @Override
    public void refill(int quantity) {
        currentState.refill(quantity);
    }

    void setHasQuarterState() {
        currentState = hasQuarterState;
    }

    void setOutOfGumballsState() {
        currentState = outOfGumballsState;
    }

    void setNoQuarterState() {
        currentState = noQuarterState;
    }

    void dispenseGumball() {
        checkState(gumballsCounter > 0, "No gumballs left");
        gumballsCounter--;
    }

    void doInsertQuarter(){
        quartersCounter++;
    }

    void doRefill(int quantity){
        checkArgument(quantity > 0, "Quantity has to be greater then 0.");
        gumballsCounter += quantity;
    }

    boolean noGumballs() {
        return gumballsCounter == 0;
    }

    void doEjectQuarter() {
        checkState(quartersCounter > 0, "No quarters inside");
        quartersCounter--;
    }

    @Override
    public String toString() {
        return String.format("Gumball machine, state:%s,  gumballs: %d, quarters: %d.", currentState, gumballsCounter, quartersCounter);
    }
}

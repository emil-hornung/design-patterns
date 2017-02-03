package pl.hornunge.behavioral.state.gumball_machine;

public interface GumballMachineState {
    void insertQuarter();
    void turnCrank();
    void ejectQuarter();
    void refill(int quantity);
}

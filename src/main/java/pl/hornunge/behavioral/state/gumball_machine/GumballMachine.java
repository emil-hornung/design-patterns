package pl.hornunge.behavioral.state.gumball_machine;

public interface GumballMachine {
    void insertQuarter();
    void turnCrank();
    void ejectQuarter();
    void refill(int quantity);
}

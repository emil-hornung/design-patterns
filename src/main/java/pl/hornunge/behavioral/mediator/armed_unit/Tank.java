package pl.hornunge.behavioral.mediator.armed_unit;

import pl.hornunge.behavioral.mediator.commander.Commander;

public class Tank implements ArmedUnit {

    private Commander commander;

    @Override
    public void startAttack() {
        if (commander.canAttack()){
            commander.attacking(this);
            System.out.println("Tank attacking.");
        } else {
            System.out.println("Tank can't attack now.");
        }
    }

    @Override
    public void stopAttack() {
        commander.stoppingAttack(this);
        System.out.println("Tank stopping attack.");
    }


    @Override
    public void setCommander(Commander commnander) {
        this.commander = commnander;
    }
}

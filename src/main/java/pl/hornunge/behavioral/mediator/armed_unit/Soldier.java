package pl.hornunge.behavioral.mediator.armed_unit;

import pl.hornunge.behavioral.mediator.commander.Commander;

public class Soldier implements ArmedUnit {

    private Commander commander;

    @Override
    public void startAttack() {
        if (commander.canAttack()){
            commander.attacking(this);
            System.out.println("Soldier attacking.");
        } else {
            System.out.println("Soldier can't attack now.");
        }
    }

    @Override
    public void stopAttack() {
        commander.stoppingAttack(this);
        System.out.println("Soldier stopping attack.");
    }

    @Override
    public void setCommander(Commander commander) {
        this.commander = commander;
    }
}

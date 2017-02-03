package pl.hornunge.behavioral.mediator;

import pl.hornunge.behavioral.mediator.armed_unit.Soldier;
import pl.hornunge.behavioral.mediator.armed_unit.Tank;
import pl.hornunge.behavioral.mediator.commander.Commander;
import pl.hornunge.behavioral.mediator.commander.OnlyOneUnitAttackingCommander;
import pl.hornunge.behavioral.mediator.commander.PreemptiveOnlyOneUnitAttackingCommander;

public class MediatorExample {
    public static void main(String[] args) {
        System.out.println("OnlyOneUnitAttackingCommander");
        Commander onlyOneUnitAttackingCommander = new OnlyOneUnitAttackingCommander();

        Soldier soldier1 = createSoldierWithCommander(onlyOneUnitAttackingCommander);
        Tank tank1 = createTankWithCommander(onlyOneUnitAttackingCommander);

        onlyOneUnitAttackingCommander.addUnit(soldier1);
        onlyOneUnitAttackingCommander.addUnit(tank1);

        startFire(soldier1, tank1);

        System.out.println("PreemptiveOnlyOneUnitAttackingCommander");
        Commander preemptiveOnlyOneUnitAttackingCommander = new PreemptiveOnlyOneUnitAttackingCommander();

        Soldier soldier2 = createSoldierWithCommander(preemptiveOnlyOneUnitAttackingCommander);
        Tank tank2 = createTankWithCommander(preemptiveOnlyOneUnitAttackingCommander);

        preemptiveOnlyOneUnitAttackingCommander.addUnit(soldier2);
        preemptiveOnlyOneUnitAttackingCommander.addUnit(tank2);

        startFire(soldier2, tank2);

    }

    private static Tank createTankWithCommander(Commander onlyOneUnitAttackingCommander) {
        Tank tank = new Tank();
        tank.setCommander(onlyOneUnitAttackingCommander);
        return tank;
    }

    private static Soldier createSoldierWithCommander(Commander onlyOneUnitAttackingCommander) {
        Soldier soldier = new Soldier();
        soldier.setCommander(onlyOneUnitAttackingCommander);
        return soldier;
    }

    private static void startFire(Soldier soldier, Tank tank) {
        soldier.startAttack();
        tank.startAttack();
        soldier.stopAttack();
        tank.startAttack();
        soldier.startAttack();
    }
}

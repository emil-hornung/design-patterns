package pl.hornunge.behavioral.mediator.commander;

import pl.hornunge.behavioral.mediator.armed_unit.ArmedUnit;

public interface Commander {
    void addUnit(ArmedUnit armedUnit);

    boolean canAttack();

    void attacking(ArmedUnit attacker);

    void stoppingAttack(ArmedUnit attacker);
}

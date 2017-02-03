package pl.hornunge.behavioral.mediator.armed_unit;

import pl.hornunge.behavioral.mediator.commander.Commander;

public interface ArmedUnit {
    void setCommander(Commander commnander);
    void startAttack();
    void stopAttack();
}

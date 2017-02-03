package pl.hornunge.behavioral.mediator.commander;

import pl.hornunge.behavioral.mediator.armed_unit.ArmedUnit;

import java.util.ArrayList;
import java.util.List;

public class PreemptiveOnlyOneUnitAttackingCommander implements Commander {

    private List<ArmedUnit> armedUnits = new ArrayList<>();

    @Override
    public void addUnit(ArmedUnit armedUnit) {
        armedUnits.add(armedUnit);
    }

    @Override
    public boolean canAttack() {
        return true;
    }

    @Override
    public void attacking(ArmedUnit attacker) {
        armedUnits.stream()
                .filter(armedUnit -> armedUnit != attacker)
                .forEach(armedUnit -> armedUnit.stopAttack());
    }

    @Override
    public void stoppingAttack(ArmedUnit attacker) {
        //do nothing
    }
}

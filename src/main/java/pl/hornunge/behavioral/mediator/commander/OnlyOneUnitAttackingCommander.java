package pl.hornunge.behavioral.mediator.commander;

import pl.hornunge.behavioral.mediator.armed_unit.ArmedUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

public class OnlyOneUnitAttackingCommander implements Commander {

    private List<ArmedUnit> armedUnits = new ArrayList<>();

    private ArmedUnit attackingUnit = null;

    @Override
    public void addUnit(ArmedUnit armedUnit) {
        armedUnits.add(armedUnit);
    }

    @Override
    public boolean canAttack() {
        return Objects.isNull(attackingUnit);
    }

    @Override
    public void attacking(ArmedUnit attacker) {
        attackingUnit = checkNotNull(attacker);
    }

    @Override
    public void stoppingAttack(ArmedUnit attacker) {
        if (attackingUnit == checkNotNull(attacker)){
            attackingUnit = null;
        }
    }
}

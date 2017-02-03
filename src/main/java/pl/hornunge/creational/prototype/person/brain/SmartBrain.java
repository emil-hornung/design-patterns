package pl.hornunge.creational.prototype.person.brain;

import static com.google.common.base.Preconditions.checkArgument;

public class SmartBrain extends Brain {

    public SmartBrain(int iq) {
        super(iq);
        checkArgument(iq >= 100, "Iq for SmartBrain must be >= 100."); //we can't check it before invocation of super(...)
    }

    public SmartBrain clone() throws CloneNotSupportedException {
        return (SmartBrain) super.clone(); //how interesting is this! we get SmartBrain object from a super class!
    }
}

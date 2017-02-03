package pl.hornunge.behavioral.command.example1.command;

import pl.hornunge.behavioral.command.example1.device.SecurityControl;

public class ArmSecurityControl implements Command {

    private final SecurityControl securityControl;

    public ArmSecurityControl(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.arm();
    }

    @Override
    public void undo() {
        securityControl.disarm();
    }
}

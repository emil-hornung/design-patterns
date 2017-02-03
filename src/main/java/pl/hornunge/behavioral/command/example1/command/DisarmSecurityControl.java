package pl.hornunge.behavioral.command.example1.command;

import pl.hornunge.behavioral.command.example1.device.SecurityControl;

public class DisarmSecurityControl implements Command {
    private final SecurityControl securityControl;

    public DisarmSecurityControl(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.disarm();
    }

    @Override
    public void undo() {
        securityControl.arm();
    }
}

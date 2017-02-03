package pl.hornunge.behavioral.command.example1.command;

import pl.hornunge.behavioral.command.example1.device.Lights;

public class TurnLightsOn implements Command {

    private final Lights lights;

    public TurnLightsOn(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.on();
    }

    @Override
    public void undo() {
        lights.off();
    }
}

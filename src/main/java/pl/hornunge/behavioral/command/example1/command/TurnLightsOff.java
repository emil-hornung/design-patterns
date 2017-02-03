package pl.hornunge.behavioral.command.example1.command;

import pl.hornunge.behavioral.command.example1.device.Lights;

public class TurnLightsOff implements Command{
    private final Lights lights;

    public TurnLightsOff(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.off();
    }

    @Override
    public void undo() {
        lights.on();
    }
}

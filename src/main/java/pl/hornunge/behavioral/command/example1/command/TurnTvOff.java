package pl.hornunge.behavioral.command.example1.command;

import pl.hornunge.behavioral.command.example1.device.Tv;

public class TurnTvOff implements Command {
    private final Tv tv;

    public TurnTvOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}

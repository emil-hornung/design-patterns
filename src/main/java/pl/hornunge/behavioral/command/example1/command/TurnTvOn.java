package pl.hornunge.behavioral.command.example1.command;

import pl.hornunge.behavioral.command.example1.device.Tv;

public class TurnTvOn implements Command {

    private  final Tv tv;

    public TurnTvOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
        tv.setVolume(10);
        tv.setChannel(1);
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}

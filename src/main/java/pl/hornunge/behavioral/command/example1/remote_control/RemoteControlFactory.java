package pl.hornunge.behavioral.command.example1.remote_control;

import pl.hornunge.behavioral.command.example1.command.*;
import pl.hornunge.behavioral.command.example1.device.Lights;
import pl.hornunge.behavioral.command.example1.device.SecurityControl;
import pl.hornunge.behavioral.command.example1.device.Tv;

public class RemoteControlFactory {

    private Lights lights = new Lights();
    private SecurityControl securityControl = new SecurityControl();
    private Tv tv = new Tv();

    public RemoteControl createRemoteControl() {

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addAction(new TurnLightsOn(lights), new TurnLightsOff(lights));
        remoteControl.addAction(new ArmSecurityControl(securityControl), new DisarmSecurityControl(securityControl));
        remoteControl.addAction(new TurnTvOn(tv), new TurnTvOff(tv));

        return remoteControl;

    }
}

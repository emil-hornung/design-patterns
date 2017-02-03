package pl.hornunge.behavioral.command.example1;

import pl.hornunge.behavioral.command.example1.remote_control.RemoteControl;
import pl.hornunge.behavioral.command.example1.remote_control.RemoteControlFactory;

public class CommandExample {
    public static void main(String[] args) {
        RemoteControlFactory remoteControlFactory = new RemoteControlFactory();
        RemoteControl remoteControl = remoteControlFactory.createRemoteControl();

        remoteControl.pushOnButton(0);
        remoteControl.pushOffButton(0);
        remoteControl.pushOnButton(1);
        remoteControl.pushOnButton(2);

        System.out.println("Undoing...");
        remoteControl.pushUndoButton();
        remoteControl.pushUndoButton();
        remoteControl.pushUndoButton();
        remoteControl.pushUndoButton();
        remoteControl.pushUndoButton();

    }
}

package pl.hornunge.behavioral.command.example1.remote_control;

import pl.hornunge.behavioral.command.example1.command.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoteControl {
    private List<Command> onCommands = new ArrayList<>();
    private List<Command> offCommands = new ArrayList<>();
    private Stack<Command> commandsHistory = new Stack<>();

    public void addAction(Command onCommand, Command offCommand) {
        onCommands.add(onCommand);
        offCommands.add(offCommand);
    }

    public void pushOnButton(int number) {
        assertButtonNumber(number);
        Command command = onCommands.get(number);
        command.execute();
        commandsHistory.push(command);
    }

    public void pushOffButton(int number) {
        assertButtonNumber(number);
        Command command = offCommands.get(number);
        command.execute();
        commandsHistory.push(command);
    }

    public void pushUndoButton() {
        if (commandsHistory.isEmpty()) {
            System.out.println("No command to undo.");
        } else {
            commandsHistory.pop().undo();
        }
    }

    private void assertButtonNumber(int number) {
        if (number >= onCommands.size()) { //the size of on and off buttons should always be the same
            throw new IllegalArgumentException(String.format("Button with number %d doesn't exist.", number));
        }
    }


}

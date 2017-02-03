package pl.hornunge.behavioral.command.example2.command;

import pl.hornunge.behavioral.command.example2.excel.Cell;

public class SetCellTextCommand implements Command {

    private final Cell cell;
    private final String text;

    public SetCellTextCommand(Cell cell, String text) {
        this.cell = cell;
        this.text = text;
    }

    @Override
    public void execute() {
        cell.setText(text);
    }
}

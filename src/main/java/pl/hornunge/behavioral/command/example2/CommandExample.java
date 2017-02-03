package pl.hornunge.behavioral.command.example2;

import pl.hornunge.behavioral.command.example2.excel.Cell;
import pl.hornunge.behavioral.command.example2.command.SetCellTextCommand;

public class CommandExample {
    public static void main(String[] args) {
        //Please not, this example is not completed!
        Cell cell = new Cell();
        SetCellTextCommand command1 = new SetCellTextCommand(cell, "Some text");
        command1.execute();
    }
}

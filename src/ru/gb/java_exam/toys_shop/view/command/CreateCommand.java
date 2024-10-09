package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class CreateCommand extends Command {
    public CreateCommand(ConsoleUI consoleUI) {
        super("Заполнить магазин игрушками.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().create();
    }
}

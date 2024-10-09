package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class DeleteToyCommand extends Command {
    public DeleteToyCommand(ConsoleUI consoleUI) {
        super("Удалить игрушку.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().delToy();
    }
}

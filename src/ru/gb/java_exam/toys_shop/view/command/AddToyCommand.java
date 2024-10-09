package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class AddToyCommand extends Command {
    public AddToyCommand(ConsoleUI consoleUI) {
        super("Добавить игрушку.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addToy();
    }
}

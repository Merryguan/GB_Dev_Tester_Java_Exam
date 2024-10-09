package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class TakeToyCommand extends Command {
    public TakeToyCommand(ConsoleUI consoleUI) {
        super("Получить игрушку.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().takeToy();
    }
}

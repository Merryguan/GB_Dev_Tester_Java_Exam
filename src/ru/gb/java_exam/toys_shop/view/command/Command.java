package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public abstract class Command {
    private final String description;
    private final ConsoleUI consoleUI;

    public Command(String description, ConsoleUI consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }
    ConsoleUI getConsoleUI() {
        return consoleUI;
    }

    public abstract void execute();
}

package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class DrawToysCommand extends Command {
    public DrawToysCommand(ConsoleUI consoleUI) {
        super("Розыграть игрушки.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().drawToys();
    }
}

package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class ShowAllToysCommand extends Command {
    public ShowAllToysCommand(ConsoleUI consoleUI) {
        super("Вывести все игрушки.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showAllToys();
    }
}

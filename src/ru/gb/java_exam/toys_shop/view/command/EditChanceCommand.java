package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class EditChanceCommand extends Command {
    public EditChanceCommand(ConsoleUI consoleUI) {
        super("Изменить шанс выпадения игрушки.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().editChance();
    }
}

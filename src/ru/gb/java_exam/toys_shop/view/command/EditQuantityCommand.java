package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class EditQuantityCommand extends Command{
    public EditQuantityCommand(ConsoleUI consoleUI) {
        super("Изменить количество игрушек.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().editQuantity();
    }
}

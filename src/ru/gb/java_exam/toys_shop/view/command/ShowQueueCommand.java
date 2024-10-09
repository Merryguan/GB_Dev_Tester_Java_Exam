package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class ShowQueueCommand extends Command {
    public ShowQueueCommand(ConsoleUI consoleUI) {
        super("Вывести всю очередь.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showQueue();
    }
}

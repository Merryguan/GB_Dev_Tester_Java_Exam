package ru.gb.java_exam.toys_shop.view.command;

import ru.gb.java_exam.toys_shop.view.ConsoleUI;

public class DeviderCommand extends Command{
    public DeviderCommand(ConsoleUI consoleUI) {
        super("--------------------------------------------------------------------------------------", consoleUI);
    }

    @Override
    public void execute() {
    }
}

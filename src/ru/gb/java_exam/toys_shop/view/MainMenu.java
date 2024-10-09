package ru.gb.java_exam.toys_shop.view;

import ru.gb.java_exam.toys_shop.view.command.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private final List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new ShowAllToysCommand(consoleUI));
        commands.add(new AddToyCommand(consoleUI));
        commands.add(new DeleteToyCommand(consoleUI));
        commands.add(new EditChanceCommand(consoleUI));
        commands.add(new EditQuantityCommand(consoleUI));
        commands.add(new DrawToysCommand(consoleUI));
        commands.add(new ShowQueueCommand(consoleUI));
        commands.add(new TakeToyCommand(consoleUI));
        commands.add(new CreateCommand(consoleUI));
        commands.add(new StopCommand(consoleUI));
    }

    public String menu() {
        StringBuilder result = new StringBuilder();
        result.append("\nМеню:\n");
        for (int i = 0; i < commands.size(); i++) {
            result.append(i + 1).append(". ")
                    .append(commands.get(i).getDescription()).append("\n");
        }
        result.append("\n").append("Выберите пункт меню: ");
        return result.toString();
    }

    public void execute(int choice) {
        Command command = commands.get(choice - 1);
        command.execute();
    }

    public int size() {
        return commands.size();
    }

}

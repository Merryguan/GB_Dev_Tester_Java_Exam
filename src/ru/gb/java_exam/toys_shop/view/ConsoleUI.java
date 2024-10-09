package ru.gb.java_exam.toys_shop.view;

import ru.gb.java_exam.toys_shop.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private final Presenter presenter;
    private final Scanner scanner;
    private final MainMenu mainMenu;
    private boolean work;

    public ConsoleUI(Presenter presenter) {
        this.presenter = presenter;
        scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
        work = true;
    }

    @Override
    public void start() {
        int menuPoint;
        while (work) {
            System.out.println(mainMenu.menu());
            menuPoint = scanner.nextInt();
            mainMenu.execute(menuPoint);
        }
    }

    @Override
    public void printResult(String result) {
        System.out.println(result);
    }

    public void showAllToys() {
        System.out.println("Игрушки в магазине.");
        printResult(presenter.showAllToys());
    }

    public void addToy() {
        System.out.println("Добавление новой игрушки.");
        System.out.println("Введите название игрушки:");
        scanner.nextLine();
        String toyName = scanner.nextLine();
        System.out.println("Введите количество:");
        int toyQuantity = scanner.nextInt();
        System.out.println("Введите шанс выигрыша игрушки:");
        int toyChance = scanner.nextInt();
        printResult(presenter.addToy(toyName, toyQuantity, toyChance));
        System.out.println("Игрушка добавлена");
    }

    public void delToy() {
        System.out.println("Удаление игрушки.");
        System.out.println("Введите ID игрушки:");
        int toyId = scanner.nextInt();
        printResult(presenter.delToy(toyId));
        System.out.println("Игрушка удалена");
    }

    public void editChance() {
        System.out.println("Изменение шанса выпадения игрушки.");
        System.out.println("Введите ID игрушки:");
        int toyId = scanner.nextInt();
        System.out.println("Введите шанс выпадения игрушки:");
        int toyChance = scanner.nextInt();
        printResult(presenter.editChance(toyId, toyChance));
        System.out.println("Шанс выпадения игрушки изменен.");
    }

    public void editQuantity() {
        System.out.println("Изменение количества игрушек.");
        System.out.println("Введите ID игрушки:");
        int toyId = scanner.nextInt();
        System.out.println("Введите количество игрушек:");
        int toyQuantity = scanner.nextInt();
        printResult(presenter.editQuantity(toyId, toyQuantity));
        System.out.println("Количество игрушек изменено.");
    }

    public void drawToys() {
        System.out.println("Розыгрыш игрушек.");
        presenter.drawToys();
        System.out.println("Игрушки разыграны.");
    }

    public void showQueue() {
        System.out.println("Игрушки в очереди.");
        printResult(presenter.showQueue());
    }

    public void takeToy() {
        System.out.println("Получение игрушки.");
        printResult(presenter.takeToy());
    }

    public void create() {
        presenter.create();
    }

    public void stop() {
        work = false;
    }
}

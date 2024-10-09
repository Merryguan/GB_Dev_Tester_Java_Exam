package ru.gb.java_exam.toys_shop;

import ru.gb.java_exam.toys_shop.model.service.SlotMachineService;
import ru.gb.java_exam.toys_shop.presenter.Presenter;
import ru.gb.java_exam.toys_shop.view.ConsoleUI;
import ru.gb.java_exam.toys_shop.view.View;

public class App {
    private final View view;
    private final Presenter presenter;
    private final SlotMachineService model;

    public App() {
        model = new SlotMachineService();
        presenter = new Presenter(model);
        view = new ConsoleUI(presenter);
    }

    public View getView() {
        return view;
    }
}

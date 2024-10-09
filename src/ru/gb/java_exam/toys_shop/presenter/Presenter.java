package ru.gb.java_exam.toys_shop.presenter;

import ru.gb.java_exam.toys_shop.model.service.SlotMachineService;
import ru.gb.java_exam.toys_shop.view.View;

public class Presenter{
    private View view;
    private final SlotMachineService service;

    public Presenter(SlotMachineService model) {
        this.service = model;
    }

    public String showAllToys() {
        return service.toString();
    }

    public String addToy(String toyName, int toyQuantity, int toyChance) {
         return service.addToy(toyName, toyQuantity, toyChance);
    }

    public String delToy(int toyId) {
        return service.delToy(toyId);
    }

    public String editChance(int toyId, int toyChance) {
        return service.editChance(toyId, toyChance);
    }

    public String editQuantity(int toyId, int toyQuantity) {
        return service.editQuantity(toyId, toyQuantity);
    }

    public void drawToys() {
        service.drawToys();
    }

    public String showQueue() {
        return service.showQueue();
    }

    public String takeToy() {
        return service.takeToy();
    }
    /*
    public String showDayNotes(LocalDate date) {
        return service.showDayNotes(date);
    }

    public String showNote(LocalDate date, LocalTime time) {
        return service.showNote(date, time);
    }

    public String searchText(String text) {
        return service.searchText(text);
    }

    public void sortByTime() {
        service.sortByTime();
    }

    public void deleteNote(LocalDate date, LocalTime time) {
        service.deleteNote(date, time);
    }

    public void saveNotebook() {
        service.saveNotebook();
    }

    public void restoreNotebook() {
        service.restoreNotebook();
    }

     */

    public void create() {
        service.createShop();
    }
}

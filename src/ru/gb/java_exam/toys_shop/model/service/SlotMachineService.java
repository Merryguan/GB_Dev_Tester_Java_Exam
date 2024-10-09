package ru.gb.java_exam.toys_shop.model.service;

import ru.gb.java_exam.toys_shop.model.slot_machine.SlotMachine;
import ru.gb.java_exam.toys_shop.model.toy.Toy;

public class SlotMachineService {
    SlotMachine<Toy> toysShop;
    int idToy;

    public SlotMachineService() {
        this.toysShop = new SlotMachine<>();
        idToy = 1;
    }

    @Override
    public String toString() {
        return toysShop.toString();
    }

    public String addToy(String toyName, int toyQuantity, int toyChance) {
        Toy toy = new Toy(idToy, toyName, toyQuantity, toyChance);
        toysShop.addSlot(toy);
        idToy++;
        return toysShop.printSlot(idToy-1);
    }

    public String delToy(int toyId) {
        return toysShop.delSlot(toyId);
    }

    public String editChance(int toyId, int toyChance) {
        toysShop.editChance(toyId, toyChance);
        return toysShop.printSlot(toyId);
    }

    public String editQuantity(int toyId, int toyQuantity) {
        toysShop.editQuantity(toyId, toyQuantity);
        return toysShop.printSlot(toyId);
    }

    public void drawToys() {
        toysShop.drawSlots();
    }

    public String showQueue() {
        return toysShop.printQueue();
    }

    public String takeToy() {
        return toysShop.takeSlot();
    }

    public void createShop() {
        int minValue = 1;
        int maxValue = 100;
        //int roll = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        addToy("Волк",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Заяц",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Волчек",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Мяч",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Скакалка",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Поезд",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Самосвал",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Грузовик",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Тамагочи",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Кукла",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
        addToy("Спинер",
                minValue + (int) (Math.random() * (maxValue - minValue + 1)),
                minValue + (int) (Math.random() * (maxValue - minValue + 1)));
    }
}

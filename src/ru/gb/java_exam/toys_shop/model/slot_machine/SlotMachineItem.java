package ru.gb.java_exam.toys_shop.model.slot_machine;

public interface SlotMachineItem<T> {
    int getId();
    int getQuantity();
    void setQuantity(int quantity);
    int getChance();
    void setChance(int chance);
}

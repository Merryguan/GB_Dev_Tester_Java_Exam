package ru.gb.java_exam.toys_shop.model.toy;

import ru.gb.java_exam.toys_shop.model.slot_machine.SlotMachineItem;

public class Toy implements SlotMachineItem<Toy> {
    int id;
    String name;
    int quantity;
    int chance;

    public Toy(int id, String name, int quantity, int chance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getChance() {
        return chance;
    }

    @Override
    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("ID: ").append(id)
                .append(", Имя: ").append(name)
                .append(", Количество: ").append(quantity)
                .append(", Шанс выпадания: ").append(chance).append("%");
        return result.toString();
    }


}

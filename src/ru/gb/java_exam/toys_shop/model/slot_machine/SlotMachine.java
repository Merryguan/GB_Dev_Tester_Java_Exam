package ru.gb.java_exam.toys_shop.model.slot_machine;

import ru.gb.java_exam.toys_shop.model.writer.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class SlotMachine<T extends SlotMachineItem<T>> {
    List<T> slots;
    List<T> queue;

    public SlotMachine() {
        this.slots = new ArrayList<>();
        this.queue = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T item : slots) {
            result.append(item).append("\n");
        }
        return result.toString();
    }

    public List<T> getSlots() {
        return slots;
    }

    public void setSlots(List<T> slots) {
        this.slots = slots;
    }

    public List<T> getQueue() {
        return queue;
    }

    public void setQueue(List<T> queue) {
        this.queue = queue;
    }

    public void addSlot(T item) {
        slots.add(item);
    }

    public String delSlot(int itemId) {
        T result = searchSlot(itemId);
        slots.remove(result);
        return result.toString();
    }

    public T searchSlot(int itemId) {
        T result = null;
        for (T item : slots) {
            if (item.getId()== itemId) {
                result = item;
            }
        }
        return result;
    }

    public String printSlot(int itemId) {
        T result = searchSlot(itemId);
        return result.toString();
    }

    public void editChance(int itemId, int itemChance) {
        T result = searchSlot(itemId);
        result.setChance(itemChance);
    }

    public void editQuantity(int itemId, int itemQuantity) {
        T result = searchSlot(itemId);
        result.setQuantity(itemQuantity);
    }

    public void drawSlots() {
        int minValue = 1;
        int maxValue = 100;
        int roll = 0;
        for (T item : slots) {
            roll = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            if (0 < item.getQuantity()) {
                if (roll <= item.getChance()) {
                    queue.addLast(item);
                    item.setQuantity(item.getQuantity() - 1);
                }
            }
        }
    }

    public String printQueue() {
        StringBuilder result = new StringBuilder();
        for (T item : queue) {
            result.append(item).append("\n");
        }
        return result.toString();
    }

    public String takeSlot() {
        StringBuilder result = new StringBuilder();
        StringBuilder text = new StringBuilder();
        FileHandler fl = new FileHandler();
        if (!queue.isEmpty()) {
            T item = queue.getFirst();
            queue.removeFirst();
            result.append(item.toString()).append("\n")
                    .append("Игрушка получена");
            fl.saveToFile("Toys.txt", item.toString());
            return result.toString();
        }
        return "Все игрушки получены";
    }
}

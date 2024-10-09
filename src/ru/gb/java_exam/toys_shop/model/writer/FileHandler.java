package ru.gb.java_exam.toys_shop.model.writer;

import java.io.*;

public class FileHandler {
    public void saveToFile(String fileName, String text) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }
}

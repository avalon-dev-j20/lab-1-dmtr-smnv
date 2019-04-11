package ru.avalon.java.j20.labs;

import ru.avalon.java.j20.labs.tasks.*;

/**
 * Лабораторная работа №1
 *
 * по курсу: "DEV-J20. Программирование на платформе Java. Стандартные пакеты"
 */
public class Application {

    /**
     * Задачи, которые следует выполнить в рамках лабораторной работы.
     */
    private static final Task[] TASKS = {
        new Task1(),
        new Task2(),
        new Task3(),
        new Task4(),
        new Task5()
    };

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        for (Task task : TASKS) {
            task.run();
        }

    }
}

package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.util.Iterator;
import ru.avalon.java.j20.labs.models.Fibonacci;

/**
 * Задание №3
 *
 * <p>
 * Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {
        Fibonacci demoFibo = new Fibonacci(2);
        int sum = 1; // сумма первых двух элементов
        for (int item : demoFibo) {
            sum += item;
        }
    }
}

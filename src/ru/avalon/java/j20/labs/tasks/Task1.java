package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №1.
 *
 * <p>
 * Тема: "Создание обобщённых методов".
 *
 * <p>
 * В рамках задания требуется описать и выполнить несколько методов, обобщённых
 * с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {

        int[] array = arrayFactory.getInstance(20);

        Number[] objArray = new Number[array.length];
        int i = 0;
        for (int value : array) {
            objArray[i++] = value;
        }

        int min = Numbers.min(objArray).intValue();
        int max = Numbers.max(objArray).intValue();
        double avg = Numbers.avg(objArray);
    }
}

package ru.avalon.java.j20.labs.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Модель получения последовательности чисел Фибоначчи.
 *
 * <p>
 * Числа Фибонааччи (иногда пишут Фибона́чи[1]) — элементы числовой
 * последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,
 * 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … (последовательность A000045
 * в OEIS), в которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое
 * последующее число равно сумме двух предыдущих чисел. Названы в честь
 * средневекового математика Леонардо Пизанского (известного как Фибоначчи).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа
 * Фибоначчи</a>
 */
public class Fibonacci implements Iterable<Integer> {

    public List<Integer> fiboList = new ArrayList<>();

    /**
     * Конструктор класса Fibonacci, инициализирующий коллекцию типа Integer
     * последовательностью Фибоначчи заданной длины.
     *
     * @param size - длина последовательности
     */
    public Fibonacci(int size) {
        fiboList = fiboInitializer(size);
    }

    /**
     * Инициализатор последовательности Фибоначчи.
     *
     * @param quantity - длина последовательности
     * @return последовательность Фибоначчи в виде коллекции типа Integer
     */
    private List<Integer> fiboInitializer(int quantity) {
        List<Integer> array = new ArrayList<>();
        int i = 2;
        array.add(0);
        array.add(1);
        while (i < quantity) {
            array.add(array.get(i - 2) + array.get(i - 1));
            i++;
        }
        return array;
    }

    /**
     * Итератор, выполняющий обход последовательности чисел Фибоначчи.
     */
    private class FibonacciIterator implements Iterator<Integer> {

        private int index;

        /**
         * Определяет, есть ли следующее значение последовательности чисел
         * Фибоначчи.
         *
         * @return {@code true}, если следующее число последовательности
         * существует. В обратном случае {@code false}.
         */
        @Override
        public boolean hasNext() {
            return index < fiboList.size();
        }

        /**
         * Возвращает следующее число последовательности чисел Фибоначчи.
         *
         * @return следующее число последовательности.
         */
        @Override
        public Integer next() {
            index++;
            return fiboList.get(index);
        }
    }

    public int sum(List<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Возвращает итератор, позволяющий выполнить обход последовательности чисел
     * Фибоначчи.
     *
     * @return итератор последовательности чисел Фибоначчи
     */
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}

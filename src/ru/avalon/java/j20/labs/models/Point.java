package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point<T extends Number> {

    /**
     * Абсцисса точки.
     */
    private final T X;
    /**
     * Ордината точки.
     */
    private final T Y;

    /**
     * Основной конструктор класса.
     *
     * @param X абсцисса точки
     * @param Y ордината точки
     */
    public Point(T X, T Y) {
        this.X = X;
        this.Y = Y;
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public double getX() {
        return X.doubleValue();
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public double getY() {
        return Y.doubleValue();
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить дистанцию.
     * @return дистанция между точками
     */
    public double distanceTo(Point point) {
        double dx = X.doubleValue() - point.X.doubleValue();
        double dy = Y.doubleValue() - point.Y.doubleValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

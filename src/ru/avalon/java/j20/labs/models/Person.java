package ru.avalon.java.j20.labs.models;

import java.util.Objects;

/**
 * Представление о человеке.
 */
public class Person {

    /**
     * Имя.
     */
    private final String NAME;
    /**
     * Фамилия.
     */
    private final String SURNAME;

    /**
     * Создаёт экземпляр класса на основании имени и даты рождения.
     *
     * @param name имя человека
     * @param surname фамилия человека
     */
    public Person(String name, String surname) {
        this.NAME = name;
        this.SURNAME = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getNAME() {
        return NAME;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSURNAME() {
        return SURNAME;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Person) {
            Person otherPerson = (Person) otherObject;
            return NAME.equals(otherPerson.NAME) && SURNAME.equals(otherPerson.SURNAME);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, SURNAME);
    }
}

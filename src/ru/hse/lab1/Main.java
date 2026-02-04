package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/**
 * @author Горносталев Давид Львович
 * @version 1.0
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Person david = new Person();
        david.name = "Давид";
        david.age = 18;
        System.out.println("Имя:" + david.name);
        System.out.println("Возраст:" + david.age);
    }
}

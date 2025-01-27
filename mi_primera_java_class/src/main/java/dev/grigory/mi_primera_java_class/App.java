package dev.grigory.mi_primera_java_class;

import dev.grigory.Person;

public final class App {
    public static void main (String[] args) {
        Person person = new Person("Grigory", "Vladimiro", "123456789", 1986);
        System.out.println(person);
    }
} 
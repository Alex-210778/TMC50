package by.tms.homework9.main;

import by.tms.homework9.solutions.Person;
import by.tms.homework9.solutions.StreamUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(-15);
        numbers.add(17);
        numbers.add(-24);
        numbers.add(39);
        numbers.add(125);
        numbers.add(-200);
        numbers.add(-500);
        System.out.println("Конкатенация строковых представлений всех чисел списка " + numbers + '\n'
                + StreamUtils.getStringFromListOfIntegers(numbers));
        System.out.println("------------------------------------");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(599);
        integerList.add(25);
        integerList.add(41);
        integerList.add(22);
        integerList.add(13);
        System.out.println("Конкатенация строковых представлений всех чисел списка " + integerList + '\n'
                + StreamUtils.getStringFromListOfIntegers(integerList));
        System.out.println("------------------------------------");

        Person ivan = new Person("Ivan", "Ivanov", 17);
        Person ellenJorjiaAnna = new Person("Ellen_Jorjia_Anna", "Surikova", 57);
        Person anastasia = new Person("Anastasia", "Slavina", 28);
        Person mariaAleksandrina = new Person("Maria_Aleksandrina", "Aleksandrova", 25);
        Person nik = new Person("Nikolai", "Nikolaev", 55);
        Person alex = new Person("Aleksandr", "Aleksandrovich", 50);
        Person alexandr = new Person("Aleksandr", "Ivanov", 47);
        Person egor = new Person("Egor", "Egorov", 40);
        Person sam = new Person("Samuall_lee_Jackson", "Stivens", 71);
        Person andrey = new Person("Andrey", "Andreev", 56);
        List<Person> persons = new ArrayList<>();
        persons.add(ivan);
        persons.add(ellenJorjiaAnna);
        persons.add(anastasia);
        persons.add(mariaAleksandrina);
        persons.add(nik);
        persons.add(alex);
        persons.add(alexandr);
        persons.add(egor);
        persons.add(sam);
        persons.add(andrey);
        System.out.println("Полное имя самого старшего человека из списка " + persons + '\n'
                + StreamUtils.getFullNameOldestPersonFromList(persons));
    }
}

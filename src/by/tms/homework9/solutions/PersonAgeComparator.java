package by.tms.homework9.solutions;

import by.tms.homework9.solutions.Person;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}

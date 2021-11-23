package by.tms.homework9.solutions;

import java.util.List;
import java.util.stream.Collectors;

public final class StreamUtils {

    private StreamUtils() {
        throw new UnsupportedOperationException();
    }

    public static String getStringFromListOfIntegers(List<Integer> numbers) {
        return numbers.stream()
                .map(element -> String.valueOf(element))
                .reduce((count, element) -> count + element)
                .get();
    }

    public static String getFullNameOldestPersonFromList(List<Person> persons) {
        List<Person> oldestPerson = persons.stream()
                .filter(firstName -> firstName.getFirstName().length() <= 15)
                .sorted(new PersonAgeComparator())
                .collect(Collectors.toList());
        return oldestPerson.get(0).getFirstName() + " " + oldestPerson.get(0).getLastName() + " - " + oldestPerson.get(0).getAge() + " лет.";
    }
}

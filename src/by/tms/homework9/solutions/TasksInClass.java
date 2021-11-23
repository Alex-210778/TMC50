package by.tms.homework9.solutions;

import java.util.*;

public class TasksInClass {

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
        System.out.println(numbers);

        OptionalDouble stream = numbers.stream()
                .filter(it -> it % 2 != 0)
                .filter(it -> it % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Среднее значение нечётных чисел, деляхщихся на 5 = " + stream);
        System.out.println("______________________");

        List<String> stringList = new ArrayList<>();
        stringList.add("consumer");
        stringList.add("predicate");
        stringList.add("predicate");
        stringList.add("motocross");
        stringList.add("predicate");
        stringList.add("IntellijIdea");
        stringList.add("moto");
        stringList.add("strings");
        stringList.add("era");
        stringList.add("IntellijIdea");
        System.out.println(stringList);

        int stream1 = (int) stringList.stream()
                .filter(it -> it.length() > 8)
                .distinct()
                .count();
        System.out.println("Kоличество уникальных строк в списке длиной более 8 символов = " + stream1);
        System.out.println("______________________");

        Map<String, Integer> map = new HashMap<>();
        map.put("IntellijIdea", 7);
        map.put("moto", 3);
        map.put("era", 2);
        map.put("predicate", 0);
        map.put("motocross", 8);
        map.put("automobile", 7);
        System.out.println(map);

        int stream2 = (int) map.entrySet().stream()
                .filter(it -> it.getKey().length() < 7)
                .count();
        System.out.println("Сумма всех значений Map<String, Integer>, длина ключей которых меньше 7 символов = " + stream2);
    }
}

package by.tms.homework8.mains;

import by.tms.homework8.student.ScoolClass;
import by.tms.homework8.student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScoolMain {

    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Ivanov", 19, 8.3);
        Student anastasia = new Student("Anastasia", "Lanina", 18, 7.1);
        Student serg = new Student("Sersey", "Sergeev", 22, 9.0);
        Student pavel = new Student("Pavel", "Ivanov", 22, 5.4);
        Student ivan1 = new Student("Ivan", "Ivanov", 19, 8.2);
        Student anastasia1 = new Student("Ivan", "Ivanov", 19, 8.3);
        Student irina = new Student("Irina", "Isaeva", 25, 4.3);
        Student nik = new Student("Nikolai", "Kuznetsov", 22, 8.2);
        Student alex = new Student("Alexandr", "Shevchik", 24, 3.3);
        Student egor = new Student("Egor", "Egorov", 24, 7.3);

        List<Student> students = new ArrayList<>(Arrays.asList(ivan, anastasia, serg, pavel, ivan1, anastasia1,
                irina, nik, alex, egor));

        ScoolClass studentsClass = new ScoolClass(students);
        System.out.println(studentsClass);
        System.out.println("Студент с самым высоким средним баллом - " + studentsClass.getBestStudent(students));
        System.out.println("Отсортированный список студентов по имени и фамилии - " + studentsClass.getStudentsSortedByFullName(students));
        System.out.println("Отсортированный список студентов по возрасту - " + studentsClass.getStudentsSortedByAge(students));
        System.out.println("Отсортированный список студентов по среднему баллу - " + studentsClass.getStudentsSortedByAverageMark(students));
    }
}

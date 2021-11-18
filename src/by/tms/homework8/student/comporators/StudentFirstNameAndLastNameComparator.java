package by.tms.homework8.student.comporators;

import by.tms.homework8.student.Student;

import java.util.Comparator;

public class StudentFirstNameAndLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());
        return result == 0 ? o1.getFirstName().compareTo(o2.getFirstName()) : result;
    }
}

package by.tms.homework8.student.comporators;

import by.tms.homework8.student.Student;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getAverageMark() - o2.getAverageMark());
    }
}

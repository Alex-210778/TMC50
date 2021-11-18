package by.tms.homework8.student;

import by.tms.homework8.student.comporators.StudentAgeComparator;
import by.tms.homework8.student.comporators.StudentAverageMarkComparator;
import by.tms.homework8.student.comporators.StudentFirstNameAndLastNameComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScoolClass {
    private List<Student> students;

    public ScoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        Student bestStudent = students.get(0);
        Iterator<Student> iterator = students.listIterator();
        Student student;
        while (iterator.hasNext()) {
            student = iterator.next();
            if (student.getAverageMark() > bestStudent.getAverageMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public List<Student> getStudentsSortedByFullName(List<Student> students) {
        List<Student> listSortedStudent = new ArrayList<>(List.copyOf(students));
        listSortedStudent.sort(new StudentFirstNameAndLastNameComparator());
        return listSortedStudent;
    }

    public List<Student> getStudentsSortedByAge(List<Student> students) {
        List<Student> listSortedStudent = new ArrayList<>(List.copyOf(students));
        listSortedStudent.sort(new StudentAgeComparator());
        return listSortedStudent;
    }

    public List<Student> getStudentsSortedByAverageMark(List<Student> students) {
        List<Student> listSortedStudent = new ArrayList<>(List.copyOf(students));
        listSortedStudent.sort(new StudentAverageMarkComparator());
        return listSortedStudent;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ScoolClass{" +
                "students=" + students +
                '}';
    }
}
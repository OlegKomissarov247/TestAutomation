package by.bsu.komissarov.lab1.logic;

import by.bsu.komissarov.lab1.entity.Group;
import by.bsu.komissarov.lab1.entity.Student;

import java.util.LinkedList;

public class GPA {
    public static int getStudentGPA(Student student) {
        LinkedList<Integer> marks = student.getMarks();
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        int gpa = sum / marks.size();
        return gpa;
    }

    public static int getGroupGPA(Group group) {
        LinkedList<Student> students = group.getGroupStudents();
        int sum = 0;
        for (Student student : students) {
            sum += getStudentGPA(student);
        }
        int gpa = sum / students.size();
        return gpa;
    }
}

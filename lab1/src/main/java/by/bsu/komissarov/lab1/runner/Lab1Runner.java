package by.bsu.komissarov.lab1.runner;

import by.bsu.komissarov.lab1.entity.Group;
import by.bsu.komissarov.lab1.entity.Student;
import by.bsu.komissarov.lab1.logic.GPA;

import java.util.LinkedList;

public class Lab1Runner {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        Student oKomissarov = new Student("Oleg", "Komissarov");
        students.add(oKomissarov);
        Student iIvanov = new Student("Ivan", "Ivanov");
        students.add(iIvanov);
        Student aUrev = new Student("Alexey", "Urev");
        students.add(aUrev);
        Student fBukov = new Student("Fedor", "Bukov");
        students.add(fBukov);
        Student vPutin = new Student("Vladimir", "Putin");
        students.add(vPutin);
        Student uTurunen = new Student("Uma", "Thurman");
        students.add(uTurunen);

        Group group = new Group("Group2a", students);
        for(Student student: students){
            System.out.println("Grade point average of " + student.getName() + " " + student.getSurname() +
                    " is " + GPA.getStudentGPA(student) + ".");
        }
        System.out.println("Grade point average of " + group.getName() + " group is "
                + GPA.getGroupGPA(group) + ".");

    }
}

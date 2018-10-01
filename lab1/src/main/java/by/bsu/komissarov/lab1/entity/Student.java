package by.bsu.komissarov.lab1.entity;

import by.bsu.komissarov.lab1.logic.GenerationNumbersInRange;

import java.util.LinkedList;

public class Student {
    private String name;
    private String surname;
    private LinkedList<Integer> marks;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.marks = new LinkedList<Integer>();
        setMarks();
    }

    Student(String name, String surname, LinkedList<Integer> marks){
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LinkedList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(LinkedList<Integer> marks) {
        this.marks = marks;
    }

    private void setMarks() {
        for (int i = 0; i < 5; i++){
            marks.add(GenerationNumbersInRange.generateRandomIntegerInRange(1,10));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", marks=" + marks +
                '}';
    }
}

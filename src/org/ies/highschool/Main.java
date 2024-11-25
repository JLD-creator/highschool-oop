package org.ies.highschool;
import org.ies.highschool.components.StudentReader;
import org.ies.highschool.models.Student;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentReader studentReader = new StudentReader(scanner);
        Student student = studentReader.read();
        student.showInfo();
    }
}
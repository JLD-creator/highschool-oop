package org.ies.highschool.components;
import org.ies.highschool.models.Student;

import java.util.Scanner;
public class StudentReader {
    private final Scanner scanner;
    public StudentReader(Scanner scanner){
        this.scanner = scanner;
    }
    public Student read(){
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu apellido");
        String apellidos = scanner.nextLine();
        System.out.println("Introduce tu direccion");
        String direccion = scanner.nextLine();
        return new Student(nombre, apellidos, direccion);
    }
}

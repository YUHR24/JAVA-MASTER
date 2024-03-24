package String_02;

import java.util.Scanner;

public class ManejoDeNombres_Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 nombres de personas: ");
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();

        String newName1 = name1.toUpperCase().charAt(1) + "." + name1.substring(name1.length() - 2);
        String newName2 = name2.toUpperCase().charAt(1) + "." + name2.substring(name2.length() - 2);
        String newName3 = name3.toUpperCase().charAt(1) + "." + name3.substring(name3.length() - 2);

        String names = newName1 + "_";
        names += newName2 + "_";
        names += newName3;

        System.out.println(names);

    }
}

package String_02;

public class EjemploString {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2); = " + esIgual);

        String nameMayuscula = "HOLA";
        String nameMinuscula = "hola";

        esIgual = nameMinuscula.equalsIgnoreCase(nameMayuscula); //ignora si es mayuscula o minuscula
        System.out.println("nameMinuscula.equalsIgnoreCase(nameMayuscula) = " + esIgual);
        esIgual = nameMinuscula.equals(nameMayuscula); //compara que sean iguales, semsible a mayusculas o minusculas
        System.out.println("nameMinuscula.equals(nameMayuscula) = " + esIgual);


    }
}

package String_02;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);

        System.out.println(numeroA + numeroB + detalle);

        //Método concat del String
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("curso.concat(\" \" + profesor) = " + detalle2);
    }
}

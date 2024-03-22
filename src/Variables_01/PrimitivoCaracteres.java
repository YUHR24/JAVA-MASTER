package Variables_01;

public class PrimitivoCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040'; //Caracter Unicode
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        System.out.println("char corresponde en byte: " + Character.BYTES);
        System.out.println("char corresponde en BITS: " + Character.SIZE);
        System.out.println("valor maximo char: " + Character.MAX_VALUE);
        System.out.println("valor MINIMO char: " + Character.MIN_VALUE);

        char espacio = ' '; //u0020
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';



    }
}

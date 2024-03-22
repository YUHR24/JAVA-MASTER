package Variables_01;

public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 3.4028235E38f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en bytes a = " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a = " + Float.SIZE);
        System.out.println("valor maximo de un float = " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float = " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308D;
        System.out.println("\nrealDouble = " + realDouble);
        System.out.println("tipo double corresponde en bytes a = " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a = " + Double.SIZE);
        System.out.println("valor maximo de un double = " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double = " + Double.MIN_VALUE);


    }
}

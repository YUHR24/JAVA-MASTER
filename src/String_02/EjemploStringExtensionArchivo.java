package String_02;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna.imagen.pdf";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i) = " + archivo.substring(i + 1));



        
    }
}

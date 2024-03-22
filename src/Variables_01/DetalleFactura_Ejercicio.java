package Variables_01;

import java.util.Scanner;

public class DetalleFactura_Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float tax = 0.19f;

        System.out.print("Inserte the bill name: ");
        String billName = scanner.nextLine();

        System.out.print("Insert the first product price: ");
        double productOne = scanner.nextDouble();
        System.out.print("Insert the second product price: ");
        double productTwo = scanner.nextDouble();

        double total = productOne + productTwo;
        double totalTax = total * tax;
        double totalAfterTax = total + totalTax;

        String mensaje = "La factura " + billName + " tiene un total bruto de " + total + ", ";
        mensaje += "con un impuesto de " + totalTax + " ";
        mensaje += "y el monto después de impuesto es de " + totalAfterTax;

        System.out.println(mensaje);

    }
}

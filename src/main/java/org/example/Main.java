package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // impuesto de 18% si es menor igual a 2000, si es mayor se aplica 21%
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el precio de venta: ");
        double precioVenta = scanner.nextDouble();


        PrecioBoleto PrecioBoleto = new PrecioBoleto();
        double precioFinal = PrecioBoleto.precioFinal(precioVenta);
        System.out.println("El precio final del boleto es: " + precioFinal);

        scanner.close();
    }
}
class PrecioBoleto {
    private static final double impuestoMenor = 0.18;
    private static final double impuestoMayor = 0.21;
    private static final double maxMonto = 2000.0;

    public double precioFinal(double precioVenta) {
        double impuesto;
        if (precioVenta <= maxMonto) {
            impuesto = precioVenta * impuestoMenor;
        } else {
            impuesto = precioVenta * impuestoMayor;
        }
        return precioVenta + impuesto;
    }
}
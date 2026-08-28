import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
        int facturaCantidad;
        double facturaValor;
        double sumaTotal = 0;
        System.out.println("ingrese la cantidad de facturas:");
        facturaCantidad = leer.nextInt();
        for (int i = 0; i < facturaCantidad; i++) {
            System.out.println("ingrese el valor de la factura:");
            facturaValor = leer.nextDouble();
            sumaTotal = sumaTotal + facturaValor;
        }
        System.out.println("la sumatoria de todas las facturas es: " + sumaTotal);
    }
}
import java.util.Scanner;
public class EjercicioJava {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double PORCENTAJE = 100;
        int MINIMOEXCELENTE = 70;
        double votosExcelente = 0;
        int cantidadVotos = 0;
		double votosRegular = 0;
		double votosMalo = 0;
        boolean opcion = true;
        do {
            System.out.println("Evalua el servicio: 1. Excelente, 2. Regular, 3. Malo, 4. Terminar encuestas");
            int servicio = leer.nextInt();
            switch (servicio) {
                case 1:
                    System.out.println("Tu evaluación del servicio es Excelente");
                    cantidadVotos++;
                    votosExcelente++;
                    break;
                case 2:
                    System.out.println("Tu evaluación del servicio es Regular");
                    cantidadVotos++;
					votosRegular++;
                    break;
                case 3:
                    System.out.println("Tu evaluación del servicio es Malo");
                    cantidadVotos++;
					votosMalo++;
                    break;
                case 4:
                    System.out.println("Se detienen las encuestas");
                    opcion = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (opcion);
        double porcentajeExcelente = (votosExcelente / cantidadVotos) * PORCENTAJE;
                System.out.println("El porcentaje de satisfaccion fue: " + porcentajeExcelente);
        if (porcentajeExcelente >= MINIMOEXCELENTE) {
            System.out.println("Meta de satisfacción alcanzada");
        } else {
            System.out.println("La meta de satisfacción NO fue alcanzada");
        }
        System.out.println("La cantidad de votos total fueron: " + cantidadVotos);
        System.out.println("La cantidad de votos excelentes fueron: " + votosExcelente);
        System.out.println("La cantidad de votos regulares fueron: " + votosRegular);
        System.out.println("La cantidad de votos malos fueron: " + votosMalo);
        leer.close();
    }
}

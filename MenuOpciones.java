import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuOpciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Mostrar mensaje de bienvenida");
            System.out.println("2. Mostrar fecha actual");
            System.out.println("3. Salir");
            System.out.print("Elija una opción (1-3): ");
            
            opcion = scanner.nextInt(); 
            
            switch (opcion) {
                case 1:
                    System.out.println("¡Bienvenido al Menu Del Dia!"); 
                    break;
                
                case 2:
                    // Obtener la fecha actual
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    String fechaActual = dateFormat.format(new Date());
                    System.out.println("La fecha y hora actual es: " + fechaActual);
                    break;
                
                case 3:
                    System.out.println("¡Hasta la vista baby!");
                    break;
                
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 3); 

        scanner.close();
    }
}


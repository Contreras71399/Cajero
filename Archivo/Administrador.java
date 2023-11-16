package Archivo;
import java.io.Serializable;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Administrador implements Serializable {
    private static final String LOGS_FILE = "logs.txt";

    public void menuAdministrador(CajeroAutomatico cajero) {
        Scanner scanner = new Scanner(System.in);
        Administrador administrador = new Administrador();
        while (cajero.isAdministrador()) { // Utiliza el método isAdministrador()
            System.out.println("\nModo Administrador:");
            System.out.println("1. Listado de acciones");
            System.out.println("2. Billetes disponibles");
            System.out.println("3. Salir del modo administrador");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
              case break;
                acciones.Acciones(Acciones);
                  break;
                case 2:
                    administrador.BilletesDisponibles(cajero);
                    break;
                case 3:
                    cajero.setAdminMode(false);
                    // Utiliza el método setAdminMode()
                    System.out.println("Salio del modo administrador.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
    
    public void Acciones() {
        System.out.println("Lista de acciones:");
        mostrarLogs();
    }

    public void BilletesDisponibles(CajeroAutomatico cajero) {
        System.out.println("Billetes disponibles:");
        cajero.BilletesDisponibles();
    }

    private void mostrarLogs() {
        try (BufferedReader reader = new BufferedReader(new FileReader(LOGS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error. Por favor, contacte al soporte.");
        }
    }
}

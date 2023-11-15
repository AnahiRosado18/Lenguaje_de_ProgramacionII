/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero_Archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lunar
 */
public class CajeroAutomatico {
   
    private Usuario usuarioActual;
    private Billetes billetes;
    private static final String ARCHIVO_BILLETES = "billetes.dat";
    private static final String ARCHIVO_LOGS = "logs.txt";

    public CajeroAutomatico() {
        this.usuarioActual = null;
        this.billetes = new Billetes();
    }  
    public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        // Ingreso de NIP
        System.out.print("Ingrese su NIP de 4 dígitos: ");
        String nip = scanner.nextLine();
        // Verificar que el NIP sea un número de 4 caracteres
        if (!esNumero(nip) || nip.length() != 4) {
            System.out.println("El NIP debe ser un número de 4 dígitos. Inténtelo nuevamente.");
            iniciarSesion(); 
            return;
        }
        if (nombre.equalsIgnoreCase("admin") && nip.equals("3243")) {
            modoAdministrador();
        } else {
            usuarioActual = new Usuario(nombre, nip, new Random().nextInt(49001) + 1000);
            cargarBilletes();
            modoCajero();
        }
    }
        
    private boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private void modoAdministrador() {
        while (true) {
            System.out.println("\nAcciones disponibles para el administrador:");
            System.out.println("1. Mostrar historial de acciones en el log.");
            System.out.println("2. Mostrar cantidad de billetes restantes.");
            System.out.println("3. Salir.");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarLog();
                    break;
                case 2:
                    mostrarBilletes();
                    break;
                case 3:
                    System.out.println("Sesión administrador cerrada. Volviendo al inicio.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        }
    }

    private void modoCajero() {
        while (true) {
            System.out.println("\nAcciones disponibles para el cajero:");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Retirar efectivo.");
            System.out.println("3. Salir.");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    retirarEfectivo();
                    break;
                case 3:
                    System.out.println("Sesión cajero cerrada. Volviendo al inicio.");
                    guardarLog("Salir", usuarioActual.getNombre(), 0, "SI");
                    guardarBilletes();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        }
    }

    private void consultarSaldo() {
        System.out.println("Saldo actual: $" + usuarioActual.getSaldo());
        guardarLog("Consultar", usuarioActual.getNombre(), usuarioActual.getSaldo(), "SI");
    }

    private void retirarEfectivo() {
        Scanner scanner = new Scanner(System.in);

        int montoMinimo = Math.min(100 * billetes.getCantidad(100),
                Math.min(200 * billetes.getCantidad(200),
                        Math.min(500 * billetes.getCantidad(500),
                                1000 * billetes.getCantidad(1000))));

        System.out.println("Monto minimo a retirar: $" + montoMinimo);
        System.out.print("Ingrese la cantidad a retirar: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= usuarioActual.getSaldo() && cantidad <= montoMinimo) {
            if (verificarBilletesDisponibles(cantidad)) {
                usuarioActual.setSaldo(usuarioActual.getSaldo() - cantidad);
                actualizarBilletes(cantidad);
                System.out.println("Retiro exitoso. Nuevo saldo: $" + usuarioActual.getSaldo());
                guardarLog("Retirar", usuarioActual.getNombre(), cantidad, "SI");
            } else {
                System.out.println("No hay billetes disponibles para la cantidad solicitada. Cancelando operación.");
                guardarLog("Retirar", usuarioActual.getNombre(), cantidad, "NO");
            }
        } else {
            System.out.println("Monto no válido. Por favor, ingrese una cantidad correcta.");
            guardarLog("Retirar", usuarioActual.getNombre(), cantidad, "NO");
        }
    }

    private boolean verificarBilletesDisponibles(int cantidad) {
        return cantidad <= (billetes.getCantidad(100) * 100 +
                billetes.getCantidad(200) * 200 +
                billetes.getCantidad(500) * 500 +
                billetes.getCantidad(1000) * 1000);
    }  
    
    private void actualizarBilletes(int cantidadRetirada) {
        int cantidadBilletes100 = cantidadRetirada / 100;
        int cantidadBilletes200 = (cantidadRetirada % 1000) / 200;
        int cantidadBilletes500 = (cantidadRetirada % 200) / 500;
        int cantidadBilletes1000 = (cantidadRetirada % 500) / 1000;

        billetes.setCantidad(100, billetes.getCantidad(100) - cantidadBilletes100);
        billetes.setCantidad(200, billetes.getCantidad(200) - cantidadBilletes200);
        billetes.setCantidad(500, billetes.getCantidad(500) - cantidadBilletes500);
        billetes.setCantidad(1000, billetes.getCantidad(1000) - cantidadBilletes1000);

        guardarBilletes();
    }


    private void mostrarLog() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LOGS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de logs.");
        }
    }

    private void guardarLog(String accion, String usuario, int saldo, String seRealizo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_LOGS, true))) {
            writer.println(accion + "," + usuario + "," + saldo + "," + seRealizo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de logs.");
        }
    }

    private void mostrarBilletes() {
        System.out.println("\nCantidad de billetes restantes:");
        System.out.println("Billetes de $100: " + billetes.getCantidad(100));
        System.out.println("Billetes de $200: " + billetes.getCantidad(200));
        System.out.println("Billetes de $500: " + billetes.getCantidad(500));
        System.out.println("Billetes de $1000: " + billetes.getCantidad(1000));
        
        
    }

    private void cargarBilletes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_BILLETES))) {
            billetes = (Billetes) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo de billetes no existe. Creando uno nuevo.");
            billetes = new Billetes();  // Crear un nuevo objeto Billetes con valores iniciales
            guardarBilletes();          // Guardar el nuevo objeto Billetes en el archivo
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el archivo de billetes.");
        }
    
    }
    
    private void guardarBilletes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_BILLETES))) {
            oos.writeObject(billetes);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo de billetes.");
        }
    }


}

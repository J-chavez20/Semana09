package Arreglos;
import java.util.Scanner;
public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arreglo para almacenar los nombres
        String[] nombres = new String[5];
        // Pedir los nombres al usuario y almacenarlos en el arreglo
        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        // Pedir el nombre a buscar
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscar = scanner.nextLine();
        // Buscar el nombre en el arreglo
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                encontrado = true;
                posicion = i;
                break; // Salimos del bucle si encontramos el nombre
            }
        }
        if (encontrado) {
            System.out.println("El nombre " + nombreBuscar + " se encuentra en la posición " + (posicion + 1));
        } else {
            System.out.println("El nombre " + nombreBuscar + " no se encuentra en el arreglo.");
        }
    }
}

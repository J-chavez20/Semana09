
package Arreglos;
import java.util.Scanner;
public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario el número de personas
        System.out.print("Ingrese el número de personas: ");
        int numPersonas = scanner.nextInt();
        // Crear un arreglo para almacenar los pesos
        double[] pesos = new double[numPersonas];
        // Pedir el peso de cada persona y almacenarlo en el arreglo
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }
        // Calcular el peso promedio
        double sumaPesos = 0;
        for (double peso : pesos) {
            sumaPesos += peso;
        }
        double promedio = sumaPesos / numPersonas;
        // Mostrar el peso promedio
        System.out.println("El peso promedio es: " + promedio);
    }
}

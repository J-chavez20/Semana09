
package Arreglos;
import java.util.Scanner;
public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // Pedir el número de personas
        System.out.print("Ingrese el número de personas: ");
        int numPersonas = lectura.nextInt();
        // Crear un arreglo para almacenar las compras
        double[] compras = new double[numPersonas];
        // Pedir el valor de cada compra y almacenarlo en el arreglo
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese el valor de la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextDouble();
        }
        // Calcular el total de las compras
        double totalCompras = 0;
        for (double compra : compras) {
            totalCompras += compra;
        }
        // Calcular el promedio de las compras
        double promedioCompras = totalCompras / numPersonas;
        // Encontrar la compra mayor y menor
        double compraMayor = compras[0];
        double compraMenor = compras[0];
        for (int i = 1; i < numPersonas; i++) {
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        // Mostrar los resultados
        System.out.println("El total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);
    }
}

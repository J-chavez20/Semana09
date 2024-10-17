package Arreglos;
import java.util.Scanner;
public class Ejercicio2 {
      public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // Pedir el número de personas
        System.out.print("Ingrese el número de personas: ");
        int numPersonas = lectura.nextInt();
        // Crear un arreglo para almacenar los ingresos
        double[] ingresos = new double[numPersonas];
        // Pedir el ingreso de cada persona y almacenarlo en el arreglo
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble();
        }
        // Calcular el ingreso promedio
        double sumaIngresos = 0;
        for (double ingreso : ingresos) {
            sumaIngresos += ingreso;
        }
        double promedio = sumaIngresos / numPersonas;
        // Encontrar el ingreso mayor
        double ingresoMayor = ingresos[0];
        for (int i = 1; i < numPersonas; i++) {
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }

        // Mostrar los resultados
        System.out.println("El ingreso promedio es: " + promedio);
        System.out.println("El ingreso mayor es: " + ingresoMayor);
    }
}

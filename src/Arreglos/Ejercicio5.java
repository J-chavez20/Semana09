package Arreglos;
public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaración de los arreglos
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};
        int[] c = new int[a.length + b.length];
        // Intercalando los elementos
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            c[k++] = a[i++];
            c[k++] = b[j++];
        }
        // Copiando los elementos restantes (si alguno)
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        // Imprimiendo el arreglo resultante
        System.out.print("Arreglo c: ");
        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}

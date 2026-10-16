import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("¿Cuántos productos lleva?: ");
        int productos = teclado.nextInt();

        // 2. Preguntar la cantidad de productos.
        // 3. Inicializar el acumulador total.
        // 4. Usar un bucle for para pedir los productos.
        // 5. Mostrar el número de productos y el total.

        teclado.close();
    }
}

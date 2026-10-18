import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidadProductos = 0;

        System.out.println("Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("¿Cuántos productos lleva?: ");
        int productos = teclado.nextInt();
        teclado.nextLine();

        float precioTotal = 0;

        for (int i = 0; i < productos; i++) {
            System.out.println("Introduzca el nombre del producto: ");
            String nombreProducto = teclado.nextLine();

            System.out.println("Indique el precio del producto: ");
            float precio = teclado.nextFloat();

            precioTotal += precio;

            System.out.println("Producto guardado correctamente: " + nombreProducto + " - Precio: " + precio + " €");
        }

        teclado.close();
    }
}

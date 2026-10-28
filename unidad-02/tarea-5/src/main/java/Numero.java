import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class Numero {

    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = teclado.nextInt();

        boolean iguales = igual(numero1, numero2);
        System.out.println("Ambos numero son iguales: "+iguales);
        int resultado = mayor(numero1, numero2);
        System.out.println("El numero mayor es: "+resultado);
        resultado = menor(numero1, numero2);
        System.out.println("El numero menor es: "+resultado);

    }
    /**
     * Funcion que compara que numero es mayor
     * @param numero1 int del numero1
     * @param numero2 int del numero2
     * @return int del numero mayor
     */
    static int mayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    /**
     * Funcion que compara que numero es menor
     * @param numero1 int del numero1
     * @param numero2 int del numero2
     * @return int del numero mayor
     */
    static int menor (int numero1, int numero2) {
        if (numero1 < numero2) {
            return numero1;
        }
        return numero2;
    }

    /**
     * Funcion que compara si los numeros son iguales
     * @param numero1 int del numero1
     * @param numero2 int del numero2
     * @return int de los numero iguales
     */
    static boolean igual  (int numero1, int numero2) {
        if (numero1 == numero2) {
            return true;
        }
        return false;
    }
}

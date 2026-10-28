import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class AlgoritmoEuclides {

    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = teclado.nextInt();

        int resultado = calcularMCD(numero1, numero2);

        System.out.println("El mcd es: "+resultado);
    }

    /**
     * Funcion que realiza el calculo del maximo comun divisor
     * @param numero1 int del primer numero
     * @param numero2 int del segundo numero
     * @return int resultado de la operacion
     */
    static int calcularMCD(int numero1, int numero2) {
        int resultado = 0;

        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);

        while (numero2 != 0) {
            int resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;
        }
        return numero1;
    }
}

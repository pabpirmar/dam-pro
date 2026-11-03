import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class Factorial {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        int resultado = calcular(numero);
        System.out.println("El factorial calculado es: "+resultado);
    }

    /**
     * Calcula el factorial de un numero dado
     * @param numero int para el calculo del factorial
     * @return int con el resultado
     */
    static int calcular(int numero) {
        if (numero < 0 || numero > 12) {
            return 0;
        }
        int resultado = 1;
        for (int i = 2; i <= numero ; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}

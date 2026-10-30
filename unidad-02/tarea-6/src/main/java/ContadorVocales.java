import java.util.Scanner;
/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class ContadorVocales {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadena = teclado.nextLine();
        int resultado = contarVocales(cadena);
        System.out.println("El numero de vocales es: " + resultado);

    }

    /**
     * Funcion que cuenta las vocales de una cadena
     * @param sCadena int de la cadena
     * @return int del resultado
     */
    static int contarVocales(String sCadena) {
        if (sCadena == null || sCadena.isEmpty()) {
            return 0;
        }
        int resultado = 0;
        sCadena = sCadena.toLowerCase();
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            switch (caracter) {
                case 'a': case 'á': case 'ä': case 'e': case 'é': case 'ë': case 'i': case 'í': case 'ï': case 'o':
                    case 'ó': case 'ö':case 'u': case 'ú': case 'ü':
                    resultado = resultado +1;
            }

        }

        return resultado;
    }

}

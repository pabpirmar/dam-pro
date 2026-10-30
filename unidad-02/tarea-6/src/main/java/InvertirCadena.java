import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class InvertirCadena {

    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String sPalabra = teclado.nextLine();
        String sInvertida = reverse(sPalabra);
        System.out.println("Palabra invertida:" + sInvertida);
    }

    /**
     * Crea una palabra o texto invertida a la original
     * @param sPalabra String Palabra/texto original
     * @return String Cadena invertida
     */
    static String reverse(String sPalabra) {
        StringBuilder resultado = new StringBuilder();
        if (sPalabra == null || sPalabra.isEmpty()) {
            return resultado.toString();
        }
        for (int i = sPalabra.length() -1; i >= 0; i--) {
            char caracter = sPalabra.charAt(i);
            resultado.append(caracter);
        }
        return resultado.toString();
    }
}
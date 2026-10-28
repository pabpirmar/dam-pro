import java.util.Scanner;

public class PalabraInversa {
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
        // size / lenght |0| -> a 8 - 1 = 7 -> a
        //palabra = |a|l|m|e|n|d|r|a| -> |a|r|d|n|e|m|l|a|
        for (int i = sPalabra.length() -1; i >= 0; i--) {
            char caracter = sPalabra.charAt(i);
            resultado.append(caracter);
        }
        return resultado.toString();
    }

    static String reverse2(String sPalabra) {
        StringBuilder resultado = new StringBuilder(sPalabra);
        return resultado.reverse().toString();
    }
}
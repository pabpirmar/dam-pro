package ies.puerto;
import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class Palindromo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra o frase a analizar");
        String sFrase = teclado.nextLine();
        boolean bPalindrome = esPalindrome(sFrase);
        System.out.println("La palabra/frase es palindrme = "+bPalindrome);
    }

    /**
     * Funcion que recibe una palabra o frase y verifica si es palindrome
     * @param frase String con la palabra o frase
     * @return boolean de la palabra o frase
     */
    static boolean esPalindrome(String frase) {
        if (frase == null || frase.isEmpty()) {
            return false;
        }
        frase = frase.toLowerCase(); //Transforma a minuscula
        frase = frase.replace(" ","");
        for (int i = 0; i < frase.length(); i++) {
            char letraIzquierda = frase.charAt(i);
            char letraDerecha = frase.charAt(frase.length()-1-i);
            if (letraIzquierda != letraDerecha) {
                return false;
            }
        }
        return true;
    }
}
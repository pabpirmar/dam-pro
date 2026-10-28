package ies.puerto.es;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class GestorCalificaciones {


    static void main() {
        List<Double> notas = new ArrayList<>();
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        do {
            Double nota = solicitarNotaValida();
            notas.add(nota);
            System.out.println("Deseas añadir ootr nota: true/false");
            String sSalir = teclado.nextLine();
            salir = Boolean.parseBoolean(sSalir);
        }while (salir);



        System.out.println("Lista de notas:"+notas);

        double media = calcularMedia(notas);
        System.out.println("La nota media es: "+media);
        double minimo = obtenerMinimo(notas);
        System.out.println("El valor minimo es: "+minimo);
        double maximo = obtenerMaxima(notas);
        System.out.println("El valor maximo es: "+maximo);

    }

    /**
     * Funcion que convierte un numero en una nota
     * @param sNumero String con el numero
     * @return int del numero
     */
    static int convertirNumeroNotas(String sNumero) {
    int numero = 0;
    if (sNumero == null || sNumero.isEmpty()) {
        return 0;
    }
    //return Integer.parseInt(sNumero);
    numero = Integer.parseInt(sNumero);
    return numero;
    }

    /**
     * Funcion que convierte la nota
     * @param sNumero String con el numero
     * @return double de la nota
     */
    static double convertirNota(String sNumero) {
        double numero = 0;

        if (sNumero == null || sNumero.isEmpty()) {
            return 0;
        }
        numero = Double.parseDouble(sNumero);
        return numero;
    }

    /**
     * Funcion que dice si la nota es válida
     * @param dNumero Double del numero
     * @return boolean de la nota válida
     */
    static boolean esNotaValida(Double dNumero) {
        if (dNumero == null) {
            return false;
        }
        if (Double.isFinite(dNumero) || Double.isNaN(dNumero)) {
            return false;
        }
        if (dNumero < 0 || dNumero > 10) {
            return false;
        }
        return true;
    }

    /**
     * Funcion que solicita la nota válida
     * @return Double de la nota válida
     */
    static Double solicitarNotaValida() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una nota:");
        String sNota = teclado.nextLine();
        Double dNumero = null;
        try {
            dNumero = convertirNota(sNota);
        } catch (NumberFormatException e) {
            throw new RuntimeException("El numero insertado es incorrecto");
        }

        boolean bValida = esNotaValida(dNumero);
        return dNumero;
    }

    /**
     * Funcion que calcula la media
     * @param dNotas Double con la nota
     * @return double de la media
     */
    static double calcularMedia(List<Double> dNotas) {
        double media = 0;
        double suma = 0;
        for (int i = 0; i < dNotas.size(); i++) {
            suma = suma + dNotas.get(i);
        }
        media = suma/ dNotas.size();
        return media;
    }

    /**
     * Funcion que obtiene la nota maxima
     * @param lNotas Lista de las notas
     * @return double de la nota maxima
     */
    static double obtenerMaxima(List<Double> lNotas) {
        double maximo = 0;
        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) > maximo) {
                maximo = lNotas.get(i);
            }
            if (maximo == 10) {
                return maximo;
            }
        }
        return maximo;
    }

    /**
     * Funcion que obtiene la nota minima
     * @param lNotas Lista de notas
     * @return double de la nota minima
     */
    static double obtenerMinimo(List<Double> lNotas) {
        double minimo = 10;
        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) < minimo) {
                minimo = lNotas.get(i);
            }
            if (minimo == 0) {
                return minimo;
            }
        }
        return minimo;
    }

}

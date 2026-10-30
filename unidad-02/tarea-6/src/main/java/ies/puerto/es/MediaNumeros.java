package ies.puerto.es;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author pabpirmar
 * @version 1.0.0
 */
public class MediaNumeros {


    static void main() {
        

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

}

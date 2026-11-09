package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que comprueba si una reserva es valida
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class ComprobadorReservas {
    private ComprobadorReservas() { }

    /**
     * Comprueba si una reserva tiene solapamiento
     *
     * @param inicio1 LocalDate fecha de inicio1
     * @param fin1 LocalDate fecha de fin1
     * @param inicio2 LocalDate fecha de inicio2
     * @param fin2 LocalDate fecha de fin2
     * @return boolean true/false
     */
    public static boolean haySolapamiento(LocalDateTime inicio1, LocalDateTime fin1, LocalDateTime inicio2, LocalDateTime fin2) {
        if (!fin1.isAfter(inicio1) || !fin2.isAfter(inicio2)) {
            throw new IllegalArgumentException();
        }
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
}

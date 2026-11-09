package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula la llegada de un viaje
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class CalculadoraViaje {
    private CalculadoraViaje() { }

    /**
     * Calcula la llegada de un viaje
     *
     * @param salida LocalDate fecha de salida
     * @param horas Long de horas
     * @param minutos Long de minutos
     * @return LocalDate formateado
     */
    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        if (minutos < 0 || horas <0) {
            throw new IllegalArgumentException();
        }
        return salida.plusHours(horas) .plusMinutes(minutos);
    }
}

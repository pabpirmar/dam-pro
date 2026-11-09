package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que escribe el proxima cumpleaños
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class ProximoCumpleanios {
    private ProximoCumpleanios() { }

    /**
     * Calcula cuando es el proximo cumpleaños
     *
     * @param nacimiento LocalDate fecha de nacimiento
     * @param hoy LocalDate fecha de hoy
     * @return LocalDate formateado
     */
    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        boolean posterior = nacimiento.isAfter(hoy);

        if (posterior){
            throw new IllegalArgumentException();
        }

        LocalDate cumpleAnio = nacimiento.withYear(hoy.getYear());

        if (cumpleAnio.isBefore(hoy)) {
            cumpleAnio = cumpleAnio.plusYears(1);
        }

        return cumpleAnio;
    }
}

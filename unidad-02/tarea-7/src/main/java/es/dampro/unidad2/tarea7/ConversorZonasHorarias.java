package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase conversor de zonas horarias
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class ConversorZonasHorarias {
    private ConversorZonasHorarias() { }

    /**
     * Convierte la hora dependiendo de la zona horaria
     *
     * @param fechaOrigen ZoneDateTime fecha de origen
     * @param zonaDestino ZoneDateTime fecha de destino
     * @return ZoneDateTime formateado
     */
    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}

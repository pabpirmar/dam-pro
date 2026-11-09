package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que valida una fecha
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class ValidadorFechas {
    private ValidadorFechas() { }

    /**
     * Comprueba si una fecha es válida
     *
     * @param texto String de texto
     * @return LocalDate formateado
     */
    public static LocalDate validarFecha(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException();
        }
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu") .withResolverStyle(ResolverStyle.STRICT);
        
        return LocalDate.parse(texto, formato);
    }
}

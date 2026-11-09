package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula la jornada
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class CalculadoraJornada {
    private CalculadoraJornada() { }

    /**
     * Calcula el tiempo trabajando
     *
     * @param entrada LocalTime fecha de entrada
     * @param salida LocalTime fecha de salida
     * @param descansoMinutos int de descanso en minutos
     * @return Duration formateado
     */
    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        if (!salida.isAfter(entrada)) {
            throw new IllegalArgumentException();
        }
        if (descansoMinutos < 0){
            throw new IllegalArgumentException();
        }
        Duration jornadaTotal = Duration.between(entrada,salida);
        if (descansoMinutos > jornadaTotal.toMinutes()){
            throw new IllegalArgumentException();
        }
        return jornadaTotal.minusMinutes(descansoMinutos);
    }
}

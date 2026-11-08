package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula la cuenta atras para un evento
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class CuentaAtrasEvento {
    private CuentaAtrasEvento() { }

    public static void main(String[] args) {
        LocalDate fechaHoy = LocalDate.of(2026,12,01);
        LocalDate fechaEvento = LocalDate.of(2026,12,25);
        System.out.println("Faltan " +ChronoUnit.DAYS.between(fechaHoy, fechaEvento)+" dias");
    }
    /**
     * Calcula la cuenta atras para una fecha
     *
     * @param hoy LocalDate fecha de hoy
     * @param evento LocalDate fecha de evento
     * @return long formateado
     */
    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        if (hoy == null || evento == null) {
            throw new IllegalArgumentException("La fecha está vacía");
        }
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}

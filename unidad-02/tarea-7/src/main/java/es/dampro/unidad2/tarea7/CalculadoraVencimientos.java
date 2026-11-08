package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Clase que calcula el vencimiento
 *
 * @author pabpirmar
 * @version 1.0.0
 */
public final class CalculadoraVencimientos {
    private CalculadoraVencimientos() { }

    public static void main(String[] args) {
        LocalDate fechaInicial = LocalDate.of(2026,01,31);
        LocalDate fechaVencimiento = calcularVencimiento(fechaInicial, 0, 1, 0);
        System.out.println("La fecha de vencimiento es: "+fechaVencimiento);
    }
    /**
     * Calcula un vencimiento
     *
     * @param fecha LocalDate de fechas
     * @param dias int de dias
     * @param meses int de meses
     * @param anios int de anios
     * @return LocalDate formateado
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        if (fecha == null){
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        return fecha.plusYears(anios) .plusMonths(meses) .plusDays(dias);
    }
}

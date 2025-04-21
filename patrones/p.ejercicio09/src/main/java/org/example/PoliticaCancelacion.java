package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class PoliticaCancelacion {
    public double montoARembolsar(Reserva reserva, LocalDate fechaCancelacion){
        if(reserva.getFecha().isBefore(fechaCancelacion)){
            return this.calcularRembolso(reserva.montoAPagar(), ChronoUnit.DAYS.between(reserva.getFecha(),fechaCancelacion));
        }
        else{
            return 0;
        }
    }
    public abstract double calcularRembolso(double monto, long diasDeDiferencia);
}

package org.example;

import java.time.LocalDate;

public class Reserva {
    private int cantidadDias;
    private LocalDate fecha;
    private Usuario conductor;
    private AutoEnAlquiler auto;

    public double montoAPagar(){
        return this.auto.getPrecioPorDia() * this.cantidadDias;
    }

    public double montoARembolsar(LocalDate fechaCancelacion){
        return this.auto.getPoliticaCancelacion().montoARembolsar(this,fechaCancelacion);
    }

    public LocalDate getFecha() {
        return fecha;
    }

}

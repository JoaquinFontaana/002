package org.example;

public class EmpleadoTemporario extends EmpleadoFormal{
    public EmpleadoTemporario(double sueldoBasico, boolean casado, int cantidadHijos) {
        super(sueldoBasico, casado, cantidadHijos);
    }

    @Override
    public double adicionalesExtra() {
        return 0;
    }
}

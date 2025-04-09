package refactor;

public class EmpleadoPlanta extends Empleado{
    private int cantidadHijos = 0;

    @Override
    public double sueldo() {
        return this.sueldoBasico
                + (this.cantidadHijos * 2000)
                - (this.sueldoBasico * 0.13);
    }
}

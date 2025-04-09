package refactor;

public class EmpleadoTemporario extends Empleado{
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;

    @Override
    public double sueldo() {
        return this.sueldoBasico
                + (this.horasTrabajadas * 500)
                + (this.cantidadHijos * 1000)
                - (this.sueldoBasico * 0.13);
    }
}

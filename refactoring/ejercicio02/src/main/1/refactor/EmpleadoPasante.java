package refactor;

public class EmpleadoPasante extends Empleado{
    @Override
    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}

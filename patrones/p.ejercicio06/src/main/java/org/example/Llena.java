package org.example;

public class Llena implements EstadoEscursion{

    @Override
    public String obtenerInformacion(Excursion excursion){
        return "Excursión: " + excursion.getNombre() + "\n" +
                "Costo: $" + excursion.getCosto() + "\n" +
                "Fechas: del " + excursion.getInicio().toString() + " al " + excursion.getFin().toString() + "\n" +
                "Punto de encuentro: " + excursion.getPuntoDeEncuentro() + "\n";
    }

    @Override
    public void inscribirUsuario(Usuario usuario, Excursion excursion) {
        excursion.añadirAListaDeEspera(usuario);
    }

}

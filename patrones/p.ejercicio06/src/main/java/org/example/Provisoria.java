package org.example;

public class Provisoria implements EstadoEscursion{

    @Override
    public void inscribirUsuario(Usuario usuario, Excursion excursion) {
        excursion.añadirAListaDeInscriptos(usuario);
        if(excursion.getCantidadInscriptos() >= excursion.getCupoMinimo()){
            excursion.setEstado(new Definitiva());
        }
    }

    @Override
    public String obtenerInformacion(Excursion excursion){
        int faltantes = excursion.getCupoMinimo() - excursion.getCantidadInscriptos();
        return "Excursión: " + excursion.getNombre() + "\n" +
                "Costo: $" + excursion.getCosto() + "\n" +
                "Fechas: del " + excursion.getInicio().toString() + " al " + excursion.getFin().toString() + "\n" +
                "Punto de encuentro: " + excursion.getPuntoDeEncuentro() + "\n" +
                "Faltan " + faltantes + " usuario(s) para alcanzar el cupo mínimo.";
    }
}

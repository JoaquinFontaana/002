package org.example;

public class Definitiva  implements EstadoEscursion{

    @Override
    public String obtenerInformacion(Excursion excursion) {
        int faltantes = excursion.getCupoMaximo() - excursion.getCantidadInscriptos();
        String mails = excursion.getMailsInscriptos();
        return "Excursión: " + excursion.getNombre() + "\n" +
                "Costo: $" + excursion.getCosto() + "\n" +
                "Fechas: del " + excursion.getInicio() + " al " + excursion.getFin() + "\n" +
                "Punto de encuentro: " + excursion.getPuntoDeEncuentro() + "\n" +
                "Usuarios inscriptos:\n" + mails +
                "Faltan " + faltantes + " usuario(s) para alcanzar el cupo máximo.";
    }

    @Override
    public void inscribirUsuario(Usuario usuario, Excursion excursion) {
        excursion.añadirAListaDeInscriptos(usuario);
        if(excursion.getCantidadInscriptos() == excursion.getCupoMaximo()){
            excursion.setEstado(new Llena());
        }
    }
}

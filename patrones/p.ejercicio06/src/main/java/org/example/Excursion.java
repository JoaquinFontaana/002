package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
    private EstadoEscursion estado;
    private String nombre;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private LocalDate inicio;
    private LocalDate fin;
    private String puntoDeEncuentro;
    private List<Usuario> inscriptos;
    private List<Usuario> listaEspera;

    public Excursion(double costo,String nombre, int cupoMaximo, int cupoMinimo,LocalDate inicio,LocalDate fin, String puntoDeEncuentro){
        this.nombre = nombre;
        this.costo = costo;
        this.inscriptos = new ArrayList<>();
        this.listaEspera = new ArrayList<>();
        this.estado = new Provisoria();
        this.cupoMaximo = cupoMaximo;
        this.cupoMinimo = cupoMinimo;
        this.inicio = inicio;
        this.fin = fin;
        this.puntoDeEncuentro = puntoDeEncuentro;
    }

    public String obtenerInformacion(){
        return this.estado.obtenerInformacion(this);
    }
    public void inscribirUsuario(Usuario usuario){
        this.estado.inscribirUsuario(usuario,this);
    }

    public void setEstado(EstadoEscursion estado) {
        this.estado = estado;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public LocalDate getFin() {
        return fin;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void añadirAListaDeEspera(Usuario usuario){
        this.listaEspera.add(usuario);
    }
    public void añadirAListaDeInscriptos(Usuario usuario){
        this.inscriptos.add(usuario);
    }
    public String getPuntoDeEncuentro() {
        return puntoDeEncuentro;
    }
    public int getCantidadInscriptos(){
        return this.inscriptos.size();
    }
    public int getCantidadListaEspera(){
        return this.listaEspera.size();
    }
    public String getMailsInscriptos() {
        return this.inscriptos.stream()
                .map(Usuario::getEmail)
                .collect(Collectors.joining("\n"));
    }

}

package main;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Turno {

    private Persona titular;
    private Timestamp fecha_hora;
    private List<Persona> jugadores;
    private Encargado encargado;
    private boolean pagado;

    public Turno (Persona titular,Timestamp fecha_hora,Encargado encargado,boolean pagado){

        this.titular=titular;
        this.fecha_hora=fecha_hora;
        this.jugadores=new ArrayList<>();
        this.encargado=encargado;
        this.pagado=pagado;
    }

    public void setJugadores(Persona jugador) {
        this.jugadores.add(jugador);
    }

    public Persona getTitular() {
        return titular;
    }

    public List<Persona> getJugadores() {
        return jugadores;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public Timestamp getFecha_hora() { return this.fecha_hora }

}


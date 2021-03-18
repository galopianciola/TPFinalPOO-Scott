package main;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cancha extends Elemento{

    private List<Turno> turnos = new ArrayList<>();
    private int capacidad;
    private boolean ocupada;
    private int precioTurno;
    private String estado;
    private double gastoMensual;
    private int nroCancha;

    public Cancha(){

    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public Cancha getCanchaDisponible(Date fecha, Time hora) {
        return null;
    }

    @Override
    public boolean getEstado() {
        return false;
    }

    @Override
    public double getGastoMensual() {
        return 0;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public int getPrecioTurno() {
        return precioTurno;
    }

    public List<Turno> getTurnos(){
        return this.turnos;
    }

   // public List<Principal.Turno> getTurno();

    public int getNroCancha(){
        return this.nroCancha;
     }

    public void setTurno(Turno t) {
        this.turnos.add(t);
    }

    public void setCapacidad(int c){
        this.capacidad = c;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setPrecioTurno(int precioTurno) {
        this.precioTurno = precioTurno;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setGastoMensual(double gastoMensual) {
        this.gastoMensual = gastoMensual;
    }

    public void setNroCancha(int nroCancha) {
        this.nroCancha = nroCancha;
    }

    public List<Turno> getTurnos() {
        return this.turnos;
    }


}

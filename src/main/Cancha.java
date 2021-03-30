package main;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Filtros.*;
public class Cancha extends Elemento{

    private List<Turno>turnos = new ArrayList<>();
    private int capacidad;
    private boolean ocupada;
    private int precioTurno;
    private boolean estado;
    private double gastoMensual;
    private int nroCancha;

    public Cancha(int capacidad, boolean ocupada, int precioTurno, boolean estado, double gastoMensual, int nroCancha) {
        this.capacidad = capacidad;
        this.ocupada = ocupada;
        this.precioTurno = precioTurno;
        this.estado = estado;
        this.gastoMensual = gastoMensual;
        this.nroCancha = nroCancha;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    @Override
    public Cancha getCanchaDisponible(Date fecha, Time hora) {
        return null;
    }

    @Override
    public boolean getEstado() {
      return this.estado;
    }

    @Override
    public double getGastoMensual() {
        return this.gastoMensual;
    }

    @Override
    public List<Cancha> getCanchasXFiltro(Filtro f1) {
        List<Cancha> retorno = new ArrayList<>();
        if (f1.cumple(this) == true)
            retorno.add(this);
        return retorno;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public int getPrecioTurno() {
        return precioTurno;
    }

    public List<Turno> getTurnos() {
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


    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setPrecioTurno(int precioTurno) {
        this.precioTurno = precioTurno;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setGastoMensual(double gastoMensual) {
        this.gastoMensual = gastoMensual;
    }

    public void setNroCancha(int nroCancha) {
        this.nroCancha = nroCancha;
    }

    @Override
    public int getCantElementosDisponibles(){
        if (this.estado = true)
            return 1;
        else
            return 0;
    }


}

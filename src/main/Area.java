package main;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Filtros.*;
public class Area extends Elemento{
    private List<Elemento> elementos;
    private int baños;

    public Area (int baños){
        this.baños = baños;
        this.elementos = new ArrayList<>();
    }


    @Override
    public int getCapacidad() {
        int retorno=0;
        for(Elemento e:this.elementos)
            retorno=retorno+e.getCapacidad();

        return retorno;
    }

    @Override
    public Cancha getCanchaDisponible(Date fecha, Time hora) {
        return null;
    }

    @Override
    public List<Cancha> getCanchasXFiltro(Filtro f1){
        List<Cancha> retorno = new ArrayList<>();
        for(Elemento e:this.elementos)
            retorno.addAll(e.getCanchasXFiltro(f1));
        return retorno;
    }

    public String getPorcentajeCanchasDisponibles(Filtro f1){
        double retorno = 0;
        List<Cancha> aux = new ArrayList<>();
        aux = this.getCanchasXFiltro(f1);
        int canchasDisponibles = 0;
        canchasDisponibles = aux.size();
        int canchasTotales = 0;
        canchasTotales = this.getCantElementosDisponibles();

        retorno = ((double) canchasDisponibles/(double) canchasTotales) * 100;
        return canchasDisponibles + "/" + canchasTotales + " (" + retorno +"%)";

    }
    @Override
    public int getCantElementosDisponibles(){
        int retorno = 0;
        for(Elemento e:this.elementos)
            retorno = retorno + e.getCantElementosDisponibles();
        return retorno;
    }

    @Override
    public boolean getEstado() { //se fija si el area esta disponible(con que haya 1 cancha disponible alcanza)
        boolean retorno=false;
        for(Elemento e:this.elementos)
            if(e.getEstado()==true)
                retorno=true;
        return retorno;
    }

    public String getPorcentajeCanchasMantenimiento(){ //devuelve el porcentaje de elementos en mantenimiento
        int cantElementosMantenimiento=0;
        double retorno=0;
        for(Elemento e:this.elementos)
            if (e.getEstado()==false)
                cantElementosMantenimiento++;
        if (cantElementosMantenimiento == 0)
            return cantElementosMantenimiento + "/" + this.elementos.size() + " (" + retorno + "%)";
        else
            retorno = ( (double) cantElementosMantenimiento/(double) this.elementos.size())*100;
        
        return cantElementosMantenimiento + "/" + this.elementos.size() + " (" + retorno + "%)";
       
    }

    @Override
    public double getGastoMensual() {
        double retorno = 0;
        for(Elemento e:this.elementos)
            retorno=retorno + e.getGastoMensual();
        return retorno;

    }

    public int getBaños() {
        return baños;
    }

    public void addElemento(Elemento e) {
        this.elementos.add(e);
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }
}

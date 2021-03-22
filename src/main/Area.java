package main;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public Cancha getDisponibilidadEnHorario(Date fecha, Time hora) {
        //usar el filtro Filtros.FxDisponibilidad y por deporte para cada Principal.Elemento
        //y aca  devolver una lista
        return null;
    }

    @Override
    public boolean getEstado() { //se fija si el area esta disponible(con que haya 1 cancha disponible alcanza)
        boolean retorno=false;
        for(Elemento e:this.elementos)
            if(e.getEstado()==true)
                retorno=true;
        return retorno;
    }

    public String getPorcentajeElementosDisponibles(){ //devuelve el porcentaje de elementos disponibles
        int cantElementosDisponibles=0;
        double retorno=0;
        for(Elemento e:this.elementos)
            if (e.getEstado()==true)
                cantElementosDisponibles++;
        if (cantElementosDisponibles == 0)
            return "Disponible en 0%";
        else
            retorno = (cantElementosDisponibles/this.elementos.size())*100;
            return "Disponible en " + retorno;
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

package Filtros;

import main.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class FxDisponibilidad implements Filtro{

    private Timestamp fecha_hora;

    public FxDisponibilidad(Timestamp fecha){
        this.fecha_hora=fecha_hora;
    }

    @Override
    public boolean cumple(Cancha c){
        boolean disponible = true;
        List<Turno> aux = new ArrayList<>();
        aux = c.getTurnos();

        for(Turno t : aux) {
            if (aux.getFechaHora() == fecha_hora)
                //ver bien si esta incluido el rango horario
                disponible = false;
        }

        return disponible;
    }
}


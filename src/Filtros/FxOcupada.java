package Filtros;
import main.*;

public class FxOcupada implements Filtro {

    public FxOcupada(){

    }

    @Override
    public boolean cumple(Cancha c){
        return c.isOcupada();
    }
}

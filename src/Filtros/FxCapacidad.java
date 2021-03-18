package Filtros;
import main.*;

public class FxCapacidad implements Filtro{

    private int capacidadRequerida;
    private int limiteInf;
    private int limiteSup;

    public FxCapacidad(int capacidadRequerida){
        this.capacidadRequerida=capacidadRequerida;
    }

    public FxCapacidad(int limiteSup,int limiteInf){
        this.limiteInf=limiteInf;
        this.limiteSup=limiteSup;
    }

    @Override
    public boolean cumple(Cancha c){
        if (this.capacidadRequerida == null)
            return c.getCapacidad()>=limiteInf && c.getCapacidad()<=limiteSup;
        else
            return c.getCapacidad()==capacidadRequerida;

        return false;
    }
}

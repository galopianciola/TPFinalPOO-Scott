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
        return 0;
    }

    @Override
    public Cancha getDisponibilidadEnHorario(Date fecha, Time hora) {
        //usar el filtro FxDisponibilidad y por deporte para cada Elemento
        //y aca  devolver una lista
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

    public int getBaños() {
        return baños;
    }

    public void setLista(Elemento e) {
        this.lista.add(e);
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }
}

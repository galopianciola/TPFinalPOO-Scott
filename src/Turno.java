import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Turno {

    private Persona titular;
    private Date fecha;
    private Time hora;
    private List<Persona> jugadores;
    private Encargado encargado;
    private boolean pagado;

    public Turno (Persona titular,Date fecha,Time hora,Encargado encargado,boolean pagado){

        this.titular=titular;
        this.fecha=fecha;
        this.hora=hora;
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
}


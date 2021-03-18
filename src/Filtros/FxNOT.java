package Filtros;
import main.*;

public class FxNOT implements Filtro {
    private Filtro f;

    FxNOT(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Cancha c) {
        return !f.cumple(c);
    }
}

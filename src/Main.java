import main.*;
import Filtros.*;

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        Area a1 = new Area(2);
        Cancha c1 = new Cancha(10,false,200,true,3000,1);
        Cancha c2 = new Cancha(21,false,200,true,3000,2);
        Cancha c3 = new Cancha(10,false,200,false,3000,3);

        a1.addElemento(c1);
        a1.addElemento(c2);
        a1.addElemento(c3);

        System.out.println(a1.getPorcentajeElementosDisponibles());

        /*Filtro f1 = new FxCapacidad(10);
        for(Cancha c:a1.getCanchasXFiltro(f1))
            System.out.println("Canchas filtradas por "+f1+":"+c.getNroCancha());*/

        /*Timestamp t = new Timestamp(2021,03,27,10,30,30,0);
        Filtro f2 = new FxDisponibilidad(t);
        Persona p1 = new Persona("Julian","Wagner",41537503,"urquiza",228422);
        Encargado e1 = new Encargado("xd","xdxd",423332,"rasdsa",222233,a1,22);
        Turno t1 = new Turno(p1,t,e1,true);

        c2.setTurno(t1);
        for(Cancha c:a1.getCanchasXFiltro(f2))
            System.out.println("Canchas filtradas por "+f2+":"+c.getNroCancha());

             */


    }

}

public class Encargado extends Persona{

    private Area area;
    private double sueldo;


    public Encargado(String nombre, String apellido, int dni, String direccion, int telefono,Area area,double sueldo) {
        super(nombre, apellido, dni, direccion, telefono);
        this.area=area;
        this.sueldo=sueldo;
    }

    public void setTurno(Turno t){

    }

    public void setArea(Area a){
        this.area=a;
    }
}

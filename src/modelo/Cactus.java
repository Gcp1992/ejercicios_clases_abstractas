package modelo;

public class Cactus extends Planta{
    public Cactus(String especie, String nombreComun, int edad) {
        super(especie, nombreComun, edad);
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando el cactus con " + cantidad + "ml de agua durante " + tiempo + " minutos.");
    }
}

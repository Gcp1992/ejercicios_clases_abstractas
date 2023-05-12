package modelo;

public class PlantaTropical extends Planta {
    public PlantaTropical(String especie, String nombreComun, int edad) {
        super(especie, nombreComun, edad);
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando planta tropical con " + cantidad + "ml de agua durante " + tiempo + " minutos.");
    }
}



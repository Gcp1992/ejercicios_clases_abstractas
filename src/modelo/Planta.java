package modelo;

public abstract class Planta {
    private String especie;
    private String nombreComun;
    private int edad;

    public Planta() {
    }

    public Planta(String especie, String nombreComun, int edad) {
        this.especie = especie;
        this.nombreComun = nombreComun;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void regar(int cantidad, int tiempo);
}

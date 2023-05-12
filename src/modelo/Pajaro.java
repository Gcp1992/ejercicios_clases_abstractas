package modelo;

public class Pajaro extends Animal{
    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo.");
    }

    //Si no implemento todos los métodos, da error porque debemos cumplir con el contrato que marca la superClase:
    @Override
    public void moverse() {
        System.out.println("El pájaro está volando.");
    }
}

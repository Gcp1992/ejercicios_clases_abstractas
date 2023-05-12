package presentacion;

import modelo.Animal;
import modelo.Pajaro;
import modelo.Perro;
import modelo.Pez;

public class TestAnimal {
    public static void main(String[] args) {
        //Puedo generar instancias usando polimorfismo:
        Animal animal1 = new Perro();
        Animal animal2 = new Pez();
        Animal animal3 = new Pajaro();
    }
}

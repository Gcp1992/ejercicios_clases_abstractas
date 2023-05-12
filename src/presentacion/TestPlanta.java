package presentacion;

import modelo.Cactus;
import modelo.Planta;
import modelo.PlantaTropical;

public class TestPlanta {
    public static void main(String[] args) {
        Planta planta1 = new PlantaTropical("Alocasia", "Orejas de elefante", 2);
        Planta planta2 = new Cactus("Cactaceae", "Cactus de San Pedro", 3);

        planta1.regar(500, 10);
        planta2.regar(200, 5);
    }
}
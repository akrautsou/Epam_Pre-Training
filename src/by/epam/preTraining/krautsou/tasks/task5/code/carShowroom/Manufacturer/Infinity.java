package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Manufacturer;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.EngineType.ElectraCar;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.EngineType.OilCar;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Core.Type;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Core.WorkClass;

public class Infinity extends WorkClass {
    public void create() {
        showRoom.addCar(new OilCar("Infinity", "Q30", 750, 175, 3, Type.HATCHBACK, true,57));
        showRoom.addCar(new OilCar("Infinity", "Q60", 1500, 300, 4, Type.SPORTSCAR, false, 50));
        showRoom.addCar(new OilCar   ("Infinity", "Q80", 1250, 200, 5, Type.CROSSOVER, true, 75));
        showRoom.addCar(new OilCar("Infinity", "Q50", 1000, 185, 5, Type.SEDAN, true, 60));
        showRoom.addCar(new ElectraCar( "Infinity", "QEI50", 1000, 185, 5, Type.SEDAN, true, 10, 5600, 500,100));
        showRoom.addCar(new OilCar("Infinity", "Q70", 1000, 185, 5, Type.SEDAN, true, 60));
        showRoom.setName("Infinity");
    }
}

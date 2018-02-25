package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.creater;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core.Type;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.ElectraCar;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.OilCar;

public class Creator {
    private static Creator instance;
    private Creator(){

    }
    public static Creator getInstance(){

        if(instance == null){
            instance = new Creator();
        }
        return instance;
    }
   public ElectraCar createElectro(String manufacturer, String model, double price, double engineCapacity, double rating, String type, boolean rightHand, int lifetime, double powerReserve, double batteryCapacity, double chargingTime ) {
       return new ElectraCar(manufacturer, model, price,engineCapacity, rating,  Type.valueOf(type), rightHand, lifetime, powerReserve, batteryCapacity, chargingTime);
    }
    public OilCar createOil(String manufacturer, String model, double price, double engineCapacity, double rating, String type, boolean rightHand, int volumeOfFuelTank) {
        return new OilCar(manufacturer, model, price,engineCapacity, rating,  Type.valueOf(type), rightHand, volumeOfFuelTank);
    }
}

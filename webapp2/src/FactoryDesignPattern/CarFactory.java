package FactoryDesignPattern;

public class CarFactory {
    public static Car getCar(String carName){
        if(carName.contains("audi")){
            return new Audi();
        }
        else if(carName.contains("Tesla")){
            return new Tesla();
        }
        else if(carName.contains("CyberTruck")){
            return new CyberTruck();
        }
        else if(carName.contains("FoodTruck")){
            return new FoodTruck();
        }
        else
            return null;
    }
}

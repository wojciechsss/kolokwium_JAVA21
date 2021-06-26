package sample;

public class Car extends Vehicle{
    public Integer doors;

    public Car(String registrationNumber, String vin, String color, Double price, Double combustion, Double fuelCondition,Double fuelCapacity , Double mileage, Integer doors) {
        super(registrationNumber, vin, color, price, combustion, fuelCondition,fuelCapacity ,mileage);
        this.doors = doors;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }
}

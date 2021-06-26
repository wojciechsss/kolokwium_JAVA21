package sample;

public class Motorcycle extends Vehicle{
    public String type;

    public Motorcycle(String registrationNumber, String vin, String color, Double price, Double combustion, Double fuelCondition,Double fuelCapacity, Double mileage, String type) {
        super(registrationNumber, vin, color, price, combustion, fuelCondition,fuelCapacity, mileage);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

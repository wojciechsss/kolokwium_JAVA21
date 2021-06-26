package sample;

public class Truck extends Vehicle{
    public Integer capacity;

    public Truck(String registrationNumber, String vin, String color, Double price, Double combustion, Double fuelCondition,Double fuelCapacity, Double mileage, Integer capacity) {
        super(registrationNumber, vin, color, price, combustion, fuelCondition,fuelCapacity, mileage);
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}

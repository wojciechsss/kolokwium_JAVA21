package sample;

public abstract class Vehicle {
    public String registrationNumber;
    public String vin;
    public String color;
    public Double price;
    public Double combustion;
    public Double fuelCondition;
    public Double fuelCapacity;
    public Double mileage;

    public Vehicle(String registrationNumber, String vin, String color, Double price, Double combustion, Double fuelCondition,Double fuelCapacity ,Double mileage) {
        this.registrationNumber = registrationNumber;
        this.vin = vin;
        this.color = color;
        this.price = price;
        this.combustion = combustion;
        this.fuelCondition = fuelCondition;
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }


    public Double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCombustion() {
        return combustion;
    }

    public void setCombustion(Double combustion) {
        this.combustion = combustion;
    }

    public Double getFuelCondition() {
        return fuelCondition;
    }

    public void setFuelCondition(Double fuelCondition) {
        this.fuelCondition = fuelCondition;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }



    public void drive(Double distance){
        if(distance() >= distance) {
            this.mileage += distance;
            this.fuelCondition -= (distance / 100) * this.combustion;
            System.out.println("No to w drogę!!");
        }else {
            System.out.println("Za mało paliwa zatankuj.");
        }
    }

    public void refueling(Double fuel){
        if(this.fuelCapacity - this.fuelCondition > fuel) {
            System.out.println("Zatankowano: " + fuel + "l");
            this.fuelCondition += fuel;
        }else {
            fuel=this.fuelCapacity - this.fuelCondition;
            System.out.println("Zatankowano do pełna: " + fuel + "l");
            this.fuelCondition += fuel;
        }
    }

    public double distance(){
        return (this.fuelCondition/this.combustion)*100;
    }

    public void changeColor(String color){
        this.color = color;
        this.price*=1.05;
        System.out.println("Zmieniono kolor na: " + color + ". Wartosć samochodu wynosi: " + this.price);
    }

}

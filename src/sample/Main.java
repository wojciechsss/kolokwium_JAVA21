package sample;

public class Main{
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("LN32134123", "vin12121", "black", 50000.0, 10.0, 45.0,80.0 , 198000.0, 5);
        Car car2 = new Car("MN25325", "vin547636", "red", 1000000.0, 15.5, 75.5, 100.0, 100000.0, 3);

        Truck truck1 = new Truck("LN32134123", "vin12121", "black", 50000.0, 10.0, 1000.0,1500.0, 198000.0, 25);
        Truck truck2 = new Truck("MN25325", "vin547636", "red", 1000000.0, 15.5, 500.0,2000.0, 100000.0, 30);

        Motorcycle motorcycle1 = new Motorcycle("LN32134123", "vin12121", "black", 15000.0, 5.0, 15.5,20.0, 198000.0, "sportowy");
        Motorcycle motorcycle2 = new Motorcycle("MN25325", "vin547636", "red", 18999.99, 6.7, 25.2, 28.0, 100000.0, "klasyczny");

        System.out.println(car1.distance());
        car1.drive(4500.5);
        car1.refueling(20.5);
        System.out.println(car1.distance());
        car1.changeColor("blue");
    }
}

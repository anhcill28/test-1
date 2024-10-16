

sealed class Vehicle permits Car, Bike {}

final class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

non-sealed class Bike extends Vehicle {
    public void ride() {
        System.out.println("Bike is riding");
    }
}

class ElectricBike extends Bike {
    public void charge() {
        System.out.println("Electric bike is charging");
    }
}
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Car và gọi phương thức drive
        Car car = new Car();
        car.drive();

        // Tạo đối tượng Bike và gọi phương thức ride
        Bike bike = new Bike();
        bike.ride();

        // Tạo đối tượng ElectricBike và gọi phương thức charge
        ElectricBike ebike = new ElectricBike();
        ebike.charge();
    }
}

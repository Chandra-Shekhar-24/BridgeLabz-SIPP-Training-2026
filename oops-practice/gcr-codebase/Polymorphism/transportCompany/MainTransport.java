package Scenario;

public class MainTransport {
    public static void main(String[] args) {

        Car car = new Car("Maruti");
        Bus bus = new Bus("Local Transport");
        Bike bike = new Bike("Honda");

        vehicle[] vehicles = {car, bus, bike};

        System.out.println(car instanceof vehicle);

        for (vehicle ele : vehicles) {
            System.out.println(ele.name + " : " + ele.costFuel(1));
        }
    }
}

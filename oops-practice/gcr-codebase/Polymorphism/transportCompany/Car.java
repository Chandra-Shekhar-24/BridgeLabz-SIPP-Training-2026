package Scenario;

public class Car extends vehicle {

    Car(String name) {
        super(name);
    }

    @Override
    public int costFuel(int km) {
        return 15 * km;
    }
}
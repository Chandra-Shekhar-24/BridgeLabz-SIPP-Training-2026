package Scenario;

public class Bike extends vehicle {

    Bike(String name) {
        super(name);
    }

    @Override
    public int costFuel(int km) {
        return 10 * km;
    }
}
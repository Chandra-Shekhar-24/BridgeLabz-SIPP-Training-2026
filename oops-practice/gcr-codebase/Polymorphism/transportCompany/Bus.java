package Scenario;

public class Bus extends vehicle {

    Bus(String name) {
        super(name);
    }

    @Override
    public int costFuel(int km) {
        return 20 * km;
    }
}
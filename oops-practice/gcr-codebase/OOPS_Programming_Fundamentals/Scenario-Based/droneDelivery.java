package oops-practice.gcr-codebase.OOPS_Programming_Fundamentals.Scenario-Based;

class droneDelivery {
    String droneId;
    int batteryPercentage;

    static String companyName = "Sky Logistics";

    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        System.out.println(droneId + " started delivery");
        batteryPercentage = batteryPercentage - 20;
    }

    void displayStatus() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        Drone d1 = new Drone("D101", 90);
        Drone d2 = new Drone("D102", 80);
        Drone d3 = new Drone("D103", 70);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("All drones share company name: " + companyName);
    }
}

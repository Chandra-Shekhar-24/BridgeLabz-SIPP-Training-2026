package oops-practice.gcr-codebase.Interfaces;

interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

public class FitnessTracker implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps.");
    }

    @Override
    public void generateReport() {
        System.out.println("Daily Report Generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to drink water!");
    }

    public static void main(String[] args) {

        FitnessTracker tracker = new FitnessTracker();

        tracker.logActivity();
        tracker.generateReport();
        tracker.sendAlert();
        tracker.resetData();
    }
}

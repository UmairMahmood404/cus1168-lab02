package academy.javapro;

public class Tesla extends Vehicle implements Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
    }

    @Override
    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled.");
    }


    @Override
    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled.");
    }

    @Override
    public boolean isAutopilotEnabled() {
        return false;
    }

    public void startCharging() {
        Electric.startCharging();
    }

    public void stopCharging() {
        Electric.stopCharging();
    }

    public boolean isCharging() {
        return Electric.isCharging();
    }
    @Override
    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Tesla engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }


    @Override
    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Tesla engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }

    @Override
    public void accelerate() {
        if (isRunning) {
            System.out.println("Tesla is accelerating.");
        } else {
            System.out.println("Start the engine first.");
        }
    }

    @Override
    public void brake() {
        if (isRunning) {
            System.out.println("Tesla is braking.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }




}

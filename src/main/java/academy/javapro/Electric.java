package academy.javapro;

public class Electric {
    private static boolean charging;

    public static void startCharging() {
        charging = true;
        System.out.println("Charging started.");
    }

    public static void stopCharging() {
        charging = false;
        System.out.println("Charging stopped.");
    }

    public static boolean isCharging() {
        return charging;
    }
}

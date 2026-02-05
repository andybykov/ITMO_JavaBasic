package Lab7;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boenig 737-800", 48000);
        Airplane airplane2 = new Airplane("Airbus 320", 50000);

        airplane1.showWeight();
        airplane2.showWeight();
    }
}

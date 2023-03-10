package Coordinates;

public class MyApp {
    double latitude = 10.0226668;
    double longitude = 52.3174861;

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.printCoordinates();
    }

    public void printCoordinates() {
        System.out.println("Широта Evern: " + latitude);
        System.out.println("Довгота Evern: " + longitude);
    }
}
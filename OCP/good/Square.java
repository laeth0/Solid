package SOLID.OCP.good;

public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square...");
        // Add drawing logic for square here
    }
}

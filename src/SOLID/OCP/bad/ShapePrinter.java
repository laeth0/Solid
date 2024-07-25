package SOLID.OCP.bad;

public class ShapePrinter {
  
  public void drawShape(Object shape) {
    if (shape instanceof Rectangle) {
      // Draw Rectangle
      System.out.println("Drawing Rectangle...");
    } else if (shape instanceof Square) {
      // Draw Square
      System.out.println("Drawing Square...");
    } else {
      System.out.println("Unsupported shape.");
    }
  }
}

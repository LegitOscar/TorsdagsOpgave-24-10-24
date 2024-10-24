package task4;
/* Der er en fejl der gør at den vil have jeg skal lave getArea om til static, men når jeg så gøre det
så vil den have det lavet tilbage til uden static.
Tænker helt sikkert at jeg har lavet en fejl i "Shape.java" så de ikke "snakker" rigtigt sammen.
Måske lave en udregnings metode i "Shape.java" som begge børne klasser så kan bruge ?
 */
public class Main {
    public static void main(String[] args) {
     ShapeBuilder shapeBuilder = new ShapeBuilder();

     shapeBuilder.addShape(new Circle(4));
     shapeBuilder.addShape(new Square(6));

        System.out.println("Circle total area: " + Circle.getArea());
        System.out.println("Square total area: " + Square.getArea());
        System.out.println("Total area of both shapes: " + shapeBuilder.getTotalArea());
    }
}

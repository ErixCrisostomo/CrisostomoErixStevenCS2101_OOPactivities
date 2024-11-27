public class Main {
    public static void main(String[] args) {
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(4, 7);
        Triangle triangle = new Triangle(5, 12, 13);

        Shape[] shapes = {square, rectangle, triangle};
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}
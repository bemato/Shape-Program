public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(2, 2), 1);
        circle.display();
        System.out.println();

        Rectangle rect = new Rectangle(new Point(1,3), new Point(3,3), new Point(3, 1), new Point(1, 1));
        rect.display();
        System.out.println();
        
        Triangle tri = new Triangle(new Point(4,4), new Point(8,2), new Point(8,6));
        tri.display();
    }
}
    
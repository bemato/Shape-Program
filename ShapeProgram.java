/**
 * title: ShapeProgram.java
 * description: Main class, host the main method. Used to run the program.
 * date: August 19, 2020
 * @author Ahmed Chaudry
 * @version 1.0
 * @copyright 2020 Ahmed Chaudry
 * 
 * ------------
 * Shape Program
 * ------------
 * Purpose: To display information (bounding box, area, perimeter) of a shape (rectange, circle, triangle.)
 * 
 * Compiling and running instructions: Use ShapeTest.java to run the program. Compiles as usual.
 * 
 * ----------
 * Classes: 
 * ----------
 *          public Shape
 *       This class acts as an abstract and provides methods for inheriting classes.
 *          
 *          public Circle extends Shape:
 *       This class can be used to create Circle objects and find their attributes.
 *          
 *          public Rectangle extends Shape:
 *       This class works with rectangle / square (special case) objects.
 *  
 *          public Triangle extends Shape:
 *       THis class works wtih triangle objects.
 * 
 *          public ShapeTest:
 *       This class hosts the main methods, and will be used to compile the program.
 * -----------
 * Test Plan:
 * -----------
 * Expected:
 *  Run application: 
 *                 1. Displays title
 *                 2. Displays an instance from rectangle, triangle, circle using the default constructor and their display methods.
 *                 3. Displays 1 instance from each of good cases, and 1 instance of each from bad cases.
 *                 4. Displays special case square.
 *                 
 * Actual:
 *                 1. Does display title
 *                 2. Displays all instances with a default constructor.
 *                 3. 
 * 
 * Expected:
 *  Good data cases: 
 *      1. Circle with origin as center and radius = 2:
 *         Area = 12.57
 *         Circumference = 12.57
 *         BBox = (-2,0, 2.0), (2.0, 2.0), (2.0, -2.0), (2.0, -2.0)
 *         
 *      2. Triangle with vertices (-1,0), (1,0), (0,1). 
 *         Area = 1.0
 *         Circumference = 4.828
 *         Bbox = (-1,0), (1,0), (-1,1), (1,1)
 *      
 *      3. Rectangle (-2,0), (2,0), (-2,2), (2, 2)
 *         Should print a message that shows that shape is a square
 *         Area = 8.0
 *         Circumference = 16.0
 *         BBox = (-2,0), (2,0), (-2,2), (2, 2)
 * 
 * Actual:
 *     1. Circle with origin as center and radius = 2:
 *          Area = 12.566370614359172
 *          Circumference:12.566370614359172
 *          BBox = X:-2.0, Y:2.0, X:2.0, Y:2.0, X:2.0, Y:-2.0, X:-2.0, Y:-2.0
 *     
 *     2. Triangle with vertices (-1,0), (1,0), (0,1). 
 *         Area = 1.0
 *         Circumference = 5.23606797749979
 *         Bbox = (-1,0), (1,0), (-1,1), (1,1)
 * 
 *     3. Rectangle (-2,4), (2,4), (2,0), (-2, 0)
 *         Shows shape is a square.
 *         Area = 8.0
 *         Circumference = 16.0
 *         BBox = (-2,4), (2,4), (2,0), (-2, 0)
 * 
 * Expected:
 *  Bad data cases:
 *      1. Circle with radius negative.
 *          Prints warning message.
 *      
 *      2. Triangle with coordinates of a line (-1,0), (1,2), (0,1):
 *          Should print warning message
 * 
 *      3. Rectangle with coordinates of a line (-1,0), (1,2), (0,1), (2,3)
 * 
 * Actual:
 *      1. Circle with radius negative.
 *           Outputs warning message correctly.
 *      
 *      2. Triangle with coordinates of a line (-1,0), (1,2), (0,1):
 *           Outputs warning message correctly. 
 *      
 *      3. Rectangle with coordinates of a line (-1,0), (1,2), (0,1), (2,3)
 *           Outputs warning message correctly.
 *                        
 */
public class ShapeProgram {
    public static void main(String[] args) {
        System.out.println("Shape Program");
        System.out.println();
        
        //default objects, their areas and circumferences, and bounding boxes.
        new Circle().display();
        new Triangle().display();
        new Rectangle().display();

        //objects with parameters
        new Circle(new Point(0,0), 2).display();
        new Triangle(new Point(-1,0), new Point(1,0), new Point(1,1)).display();;
        new Rectangle(new Point(-2,4), new Point(2,4), new Point(2,0), new Point(-2,0)).display();

        //bad cases
        new Circle(new Point(0,0), -1);
        new Triangle(new Point(-1,0), new Point(1,2), new Point(0,1));
        new Rectangle(new Point(-1,0), new Point(1,2), new Point(0,1), new Point(2,3));
    }
}
    
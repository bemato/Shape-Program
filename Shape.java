public class Shape {
    public double findArea(){
        System.out.println("The area of the shape is given.");
        return 0;   //Returning 0, because the method overriden in the derived class will need
                    // to have the same signature. Else I would have used void.
    }
    public double findCircumference(){
        System.out.println("The circumference of the shape is given.");
        return 0;
    }
    public Point[] findBoxCoordinates(){ // Finds rectangular box coordinates. The box encloses the shape.
        System.out.println("The coordinates of the bounding box are given.");
        return new Point[0];   //Returns a  point object of (0,0).
    }
    public void display(){
        System.out.println("Class Name: Shape");
        System.out.println("Area: N/A");
        System.out.println("Circumference: N/A");
        System.out.println("Bounding box coordinates: N/A");
    }
} //end of class Shape
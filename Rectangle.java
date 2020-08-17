public class Rectangle extends Shape {
    private Point vertice1;     //Top left corner of the rectangle
    private Point vertice2;     //Top right corner of the rectangle
    private Point vertice3;     //Bottom right corner of the rectangle
    private Point vertice4;     //Bottom left corner of the rectangle

    public Rectangle(){         //Default constructor. Creates a rectangle with vertice1 at origin. Length 1, width 2.
        vertice1 = new Point();
        vertice2 = new Point(2, 0);
        vertice3 = new Point(2, -1);
        vertice3 = new Point(0, -1);
    }
    public Rectangle(Point v1, Point v2, Point v3, Point v4){
        // For a shape to be a rectangle. It's width's should be the same. To be a square, the length and the width must be the same.
         Point widthPoint1 = v2.subtract(v1);
         Point widthPoint2 = v3.subtract(v4);
         Point lengthPoint = v1.subtract(v4);       //Length of one side. Widths of each side.

        if (widthPoint1.getX() == widthPoint2.getX()){          //Checks if shape is a rectangle. Initializes the rectangle corners.
            vertice1 = v1;
            vertice2 = v2;
            vertice3 = v3;
            vertice4 = v4;

            if (widthPoint1.getX() == lengthPoint.getY())
                System.out.println("Special case: The entered coordinates make a square.");
            
        }
        else
            System.out.println("Warning: The entered coordinates are not a rectangle.");
    }

    // Methods and functions.
    public double findArea(){
        return (vertice2.subtract(vertice1).getX()) * (vertice1.subtract(vertice4).getY());     //Area = length*widths => subtract the widths, get X coordinate and times 
                                                                                                // with length.
    }
    public double findCircumference(){
        return 2 * (vertice2.subtract(vertice1).getX()) + (vertice1.subtract(vertice4).getY()); //Circumference = 2 * (length + width)
    }
    public Point[] findBoxCoordinates(){ //Finds the corners of the bounding box, returns them as array.
        Point topLeft, topRight, bottomLeft, bottomRight;   //The four corners (a to d, clockwise) of the bounding box. 

        //The bounding box will have the same coordinates as the rectangle.
        topLeft = this.vertice1; 
        topRight = this.vertice2;
        bottomRight = this.vertice3;
        bottomLeft = this.vertice4;

        return new Point[]{topLeft,topRight,bottomRight,bottomLeft};    //Returns an array of the points.
    }
    public void display(){
        Point coordinates[] = this.findBoxCoordinates(); 
        int counter = 1;    //Counter variable for the loop below, used for output.

        System.out.println("Class Name: Rectangle");
        System.out.println("Area:" +this.findArea());
        System.out.println("Circumference:" +this.findCircumference());
        System.out.println("Coordinatess of the corners of the bounding box:");
        
        for (int i = 0; i < coordinates.length; i++){       //Used to properly display each Point and its 
            System.out.println("Corner" +counter+ ": ");    //coordinates.
            coordinates[i].show();
            counter++;
        }
    }

}   //End of class Rectangle
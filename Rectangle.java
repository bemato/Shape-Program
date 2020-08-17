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
        final Point widthPoint1 = vertice2.subtract(vertice1);
        final Point widthPoint2 = vertice3.subtract(vertice4);
        final Point lengthPoint = vertice1.subtract(vertice4);       //Length of one side. Widths of each side.

        if (widthPoint1.getX() == widthPoint2.getX()){          //Checks if shape is a rectangle. Initializes the rectangle corners.
            vertice1 = v1;
            vertice2 = v2;
            vertice3 = v3;
            vertice4 = v4;

            if (widthPoint1.getX() == lengthPoint.getY())
                System.out.println("Special case: The entered coordinates make a square.");
            
        }
        else
            System.out.println("Warning: The entered coordinates do not match the shape");
    }

    // Methods and functions.
    public double findArea(){
        return (vertice2.subtract(vertice1).getX()) * (vertice1.subtract(vertice4).getY());     //Area = length*widths => subtract the widths, get X coordinate and times 
                                                                                                // with length.
    }

    public double findCircumference(){
        return 2 * (vertice2.subtract(vertice1).getX()) + (vertice1.subtract(vertice4).getY()); //Circumference = 2 * (length + width)
    }

    public void Display(){
        
    }

}   //End of class Rectangle
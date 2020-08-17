public class Triangle extends Shape {
    private Point bottomLeft;      //Bottom left vertice of the triangle.
    private Point bottomRight;     //Bottom right vertice of the triangle.
    private Point top;             //The top point of the triangle.
    
    private double leftSide;       //Left side of the triangle.
    private double rightSide;      //Right side of the triangle.
    private double thirdSide;      //Third side of the triangle.

    public Triangle(){             //Makes a default triangle. 4 units base length and 2 units high.
        bottomLeft = new Point();
        bottomRight = new Point(4,0);
        top = new Point(2,2);
    }
    public Triangle(Point bottomLeft, Point bottomRight, Point top){   //Constructor with given points.
        
        //Using the triangle inequality theorem, we can determine if the points correspond to triangle.
        // We use the distance formula - we can find the length of the points, and later use them in the theorem.
        leftSide = Math.sqrt(Math.pow(top.subtract(bottomLeft).getX(), 2) + Math.pow(top.subtract(bottomLeft).getY(), 2));   //Distance formula being applied.  
        rightSide = Math.sqrt(Math.pow(top.subtract(bottomRight).getX(), 2) + Math.pow(top.subtract(bottomRight).getY(), 2));
        thirdSide = Math.sqrt(Math.pow(bottomRight.subtract(bottomLeft).getX(), 2) + Math.pow(bottomRight.subtract(bottomLeft).getY(), 2));
        

        // Now using the triangle inequality theorem:
        if (leftSide + rightSide > thirdSide){
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
            this.top = top;
        }
        else System.out.println("The given points do not conform to a triangle.");
    }

    // Methods and functions.
    public double findArea(){
        //Since we know the lengths of the three sides, we can use Heron's formula to find the area of the triangle.
        final double halfPerimeter = (leftSide + rightSide + thirdSide) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - leftSide) * (halfPerimeter - rightSide) * (halfPerimeter - thirdSide));   
    }
    public double findCircumference(){
        return leftSide + rightSide + thirdSide;
    }
    public Point[] findBoxCoordinates(){ //Finds the corners of the bounding box, returns them as array.
        Point bottomLeftBox = bottomLeft;
        Point bottomRightBox = bottomRight;
        Point topLeftBox = new Point(bottomLeft.getX(), top.getY());
        Point topRightBox = new Point(bottomRight.getX(), top.getY());

        return new Point[]{bottomLeftBox,bottomRightBox,topLeftBox,topRightBox};
    }
    public void display(){
        Point coordinates[] = this.findBoxCoordinates(); 
        int counter = 1;    //Counter variable for the loop below, used for output.

        System.out.println("Class Name: Triangle");
        System.out.println("Area:" +this.findArea());
        System.out.println("Circumference:" +this.findCircumference());
        System.out.println("Coordinatess of the corners of the bounding box:");
        
        for (int i = 0; i < coordinates.length; i++){       //Used to properly display each Point and its 
            System.out.println("Corner" +counter+ ": ");    //coordinates.
            coordinates[i].show();
            counter++;
        }
    }

}   //End of class Triangle
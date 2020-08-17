public class Circle extends Shape {
    private Point center;   //The center of the circle
    private double radius;  //The radius specified.
    
    public Circle(){    //default constructor, construct a circle with center at origin and radius 1.
        center = new Point();
        radius = 1.0;
    }
    public Circle(Point center, double radius){ //Constructor that creates an object with specifications.
        this.center = center;
        this.radius = radius;
                                            
        if (radius <= 0){                       //radius can not be 0 or less.
            System.out.println("Warning: Your radius can not be less than 0.");
        }
    }

    //Getters and setters
    public void setCenter(Point center){
        this.center = center;
    }
    public Point getCenter(){
        return center;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    //Methods and functions
    public double findArea(){   //Finds area of the circle.
        return Math.PI * (radius*radius);
    }
    public double findCircumference(){
        return 2 * Math.PI * radius;
    }
    public Point[] findBoxCoordinates(){ //Finds the corners of the bounding box, returns them as array.
        Point a, b, c, d;   //The four corners (a to d, clockwise) of the bounding box. 

        //Point A is top left. subtract x coordinate by the radius, and add y coordinate of center 
        // with radius.
        a = new Point(center.getX() - radius, center.getY() + radius);  
        b = new Point(center.getX() + radius, center.getY() + radius);
        c = new Point(center.getX() + radius, center.getY() - radius);
        d = new Point(center.getX() - radius, center.getY() - radius);

        return new Point[]{a,b,c,d};    //Returns an array of the points.
    }
    public void display(){
        Point coordinates[] = this.findBoxCoordinates(); 
        int counter = 1;    //Counter variable for the loop below, used for output.

        System.out.println("Class Name: Circle");
        System.out.println("Area:" +this.findArea());
        System.out.println("Circumference:" +this.findCircumference());
        System.out.println("Coordinatess of the corners of the bounding box:");
        
        for (int i = 0; i < coordinates.length; i++){       //Used to properly display each Point and its 
            System.out.println("Corner" +counter+ ": ");    //coordinates.
            coordinates[i].show();
            counter++;
        }
    }
} //End of class Circle
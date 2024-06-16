import java.util.Scanner;
import java.lang.Math;

class GeometricObject
{
    public String color;
    public boolean isFilled;

    //noArgs constructor
    GeometricObject()
    {
        this.color = "white";
        this.isFilled = false;
    }

    //constructor
    GeometricObject(String color, boolean isFilled)
    {
        this.color = color;
        this.isFilled = isFilled;
    }

    //set color & set isFilled methods
    public void setColor(String color) {this.color = color;}
    public void setIsFilled(boolean isFilled) {this.isFilled = isFilled;}

    //get color & get isFilled methods
    public String getColor() {return(this.color);}
    public boolean getIsFilled() {return(this.isFilled);}
}

class Triangle extends GeometricObject
{
    public double side1;
    public double side2;
    public double side3;

    //noArgs constructor
    Triangle()
    {
        this.side1=1.0;
        this.side2=1.0;
        this.side3=1.0;
    }

    //constructor with sides
    Triangle(double side1, double side2, double side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getPerimeter()
    {
        return(this.side1+this.side2+this.side3);
    }

    //get area function
    public double getArea()
    {
        //solve for the area using the area-from-sides formula
        double semiPeri = this.getArea() / 2.0;
        return ( Math.sqrt( semiPeri * (semiPeri - this.side1) * (semiPeri - this.side2) * (semiPeri - this.side2) ) );
    }

    //get side functions
    public double getSide1() {return(this.side1);}
    public double getSide2() {return(this.side2);}
    public double getSide3() {return(this.side3);}

    //toString method
    public String toString()
    {
        return("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
    }

}

class Main
{
\    //Main body program
    public static void main(String []args)
    {
        System.out.println("blah");
    }
};

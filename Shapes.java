package Assignment_12_Inheritance;

class Shape {
     String color;
     int area;
     Shape(String color)
     {
         this.color=color;
     }
    void display()
    {
        System.out.println("Color : "+color);
    }

}
class Circle extends Shape
{
    float radius;
    float area;
    Circle(String color,float radius)
    {
        super(color);
        this.radius=radius;
    }
    void areaOfCircle(float radius)
    {
        area=3.14f*radius*radius;
    }
    void display()
    {
        super.display();
        System.out.println("Area  : "+area);
    }

}
class Rectangle extends Shape{
    float length;
    float breadth;
    float area;
    Rectangle(String color,float length,float breadth) {
        super(color);
        this.length=length;
        this.breadth=breadth;
    }
    void areaOfRectangle(float length,float breadth)
    {
        area=length*breadth;
    }
    void display()
    {
        super.display();
        System.out.println("Area  : "+area);
    }

}


public class Shapes
{
    public static void main(String[] args) {
         Circle c=new Circle("Blue",3);
         c.areaOfCircle(c.radius);
         c.display();
         System.out.println("---------------------------------------------------------------------------------");
         Rectangle r=new Rectangle("Green",5,3);
         r.areaOfRectangle(r.length,r.breadth);
         r.display();

    }
}

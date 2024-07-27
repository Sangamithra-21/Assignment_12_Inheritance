package Assignment_12_Inheritance;
class Vehicles
{
    String color;
    int wheels;
    Vehicles(String color,int wheels)
    {
        this.color=color;
        this.wheels=wheels;
    }
    void display()
    {
        System.out.println("Color of Vehicle  : "+color);
        System.out.println("Number of Wheels  : "+wheels);
    }
}
class Car extends Vehicles{
    String acType;
    int seats;


    Car(String color, int wheels,String acType,int seats) {
        super(color, wheels);
        this.acType=acType;
        this.seats=seats;
    }
    void display()
    {
        super.display();
        System.out.println("Type of Ac        : "+acType);
        System.out.println("Number of Seats   : "+seats);
    }
}
class Truck extends Vehicles
{
    String type;
    int seats;
    Truck(String color, int wheels,String type,int seats) {
        super(color, wheels);
        this.type=type;
        this.seats=seats;
    }
    void display()
    {
        super.display();
        System.out.println("Type of Truck     : "+type);
        System.out.println("Number of Seats   : "+seats);
    }
}
public class VehicleHierarchy {
    public static void main(String[] args) {
        Car c=new Car("Black",4,"AC",5);
        c.display();
        System.out.println("---------------------------------------------------------------------------");
        Truck t=new Truck("Yellow",8,"Light Weight",2);
        t.display();
    }
}

import java.util.*;

class Vehicle
{
    String type;
    Vehicle(String type)
    {
        this.type = type;
    }

    public void display()
    {
        System.out.println("\n\n\n");
        System.out.println("Type of vehicle = "+type);
    }
}



class Brand extends Vehicle
{   
    String brandName;
    Brand(String type, String brandName)
    {
        super(type);
        this.brandName = brandName;
    }

    public void display()
    {
        super.display();
        System.out.println("Brand of Vehicle = "+brandName);
    }
}



class Cost extends Brand
{
    double cost;
    Cost(String type, String brandName, double cost)
    {
        super(type, brandName);
        this.cost = cost;
    }
    
    public void display()
    {
        super.display();
        System.out.println("Cost of Vehicle = "+cost);
    }
}

class VehicleInfo
{
    public static void main(String[] args)
    {
        String a,b;
        double c;

        Scanner in  = new Scanner(System.in);

        System.out.print("Enter type of Vehicle: ");
        a = in.nextLine();
        System.out.print("Enter "+a+" brand: ");
        b = in.nextLine();
        System.out.print("Enter cost of "+a+": ");
        c = in.nextDouble();

        Cost c1 = new Cost(a, b, c);
        c1.display();
    }
}

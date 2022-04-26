import java.util.Scanner;

class Box
{
    double height, width, depth;
    Box(double width, double height, double depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume()
    {
        return width*height*depth;
    }
}



class Para
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter width of box: ");
        double width = in.nextDouble();

        System.out.println("Enter height of box: ");
        double height = in.nextDouble();

        System.out.println("Enter depth of box: ");
        double depth = in.nextDouble();
        

        Box b1 = new Box(width, height, depth);
        double vol = b1.volume();
        System.out.println("Volume of the box = "+ vol);

        // ttt(args);
    }
}
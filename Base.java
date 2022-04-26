import java.util.Scanner;
import java.lang.Math;

//Create a new class called Calculator with the following methods:
//● A static method called powerInt (int num1, int num2) This method should return num1 to
//the power num2.
//● A static method called powerDouble (double num1,double num2). This method should
//return num1 to the power num2.
//● Invoke both the methods and test the functionality. Also count the number of objects
//created.

class Calculator{
    static int count=0;
    Calculator()
    {
         count++;

    }
    static double powerInt(int num1, int num2)
    {
        return Math.pow(num1, num2);
    }
    
    static double powerDouble(double num1, double num2)
    {
        return Math.pow(num1, num2);
    }
    
}

class Base{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();Calculator c3 = new Calculator();Calculator c4 = new Calculator();
        
        System.out.println("Enter first integer: ");
        int i1 = in.nextInt();
        
        System.out.println("Enter second integer: ");
        int i2 = in.nextInt();
        
        double ans = c1.powerInt(i1,i2);
        
        System.out.println("Enter first double: ");
        double d1 = in.nextDouble();
        
        System.out.println("Enter second double: ");
        double d2 = in.nextDouble();
        
        double ansd = c1.powerDouble(d1,d2);
        
        System.out.println("Integer function ans = "+ans);
        System.out.println("Double function ans = "+ansd);
        System.out.println("No of objects:"+Calculator.count);
        in.close();
    }
}
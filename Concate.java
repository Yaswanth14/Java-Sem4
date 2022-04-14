import java.util.Scanner;

public class Concate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String first = in.next();

        System.out.print("Enter Second word: ");
        String second = in.next();

        System.out.println("After concatenation: "+ first + " and " + second);
    }
}

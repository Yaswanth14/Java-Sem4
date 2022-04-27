import java.util.Scanner;

public class itemList {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[100][100];
        System.out.println("Enter initial year :");
        int first = in.nextInt();
        System.out.println("Enter last year :");
        int last = in.nextInt();

        int rows = last-first;
        System.out.println("Enter number of items: ");
        int cols = in.nextInt();

        System.out.println("Enter number of items sold in table: ");
        for(int i=1;i<=rows; i++)
        {
            for(int j=1; j<= cols; j++)
            {
                System.out.println("Enter items sold in "+(first+i)+ " of id " + (j));
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=1;i<=rows; i++)
        {
            int max =0;
            int maxi = 0;

            for(int j=1; j<=cols; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                    maxi = j;
                }
            }

            System.out.println("ID of Best sold item of year "+ (first+i)+ " = "+maxi);
            System.out.println("Number of items sold = "+max);
        }
    }
}

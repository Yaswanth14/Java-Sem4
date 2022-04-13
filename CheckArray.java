import java.util.Scanner;

public class CheckArray
{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
  
        // Check from 2 to n/2
        for (int i = 2; i < n/2; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        
        int [] nums = new int[20];
        System.out.println("Enter number of elemetns in array: ");
        int n = in.nextInt();
        System.out.println("Enter elemetns in array: ");
        for(int i=0;i<n;i++)
        {
            nums[i] = in.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2!=0 && isPrime(nums[i]))
            {
                System.out.print(nums[i]+" ");
                flag = 1;
            }
        }
        if(flag==0) System.out.print("Not Found");
        
    }
}


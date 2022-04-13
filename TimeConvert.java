
import java.util.Scanner;
import java.lang.*;

public class TimeConvert
{
    static void getNew(String time)
    {
        int h1 = (int)time.charAt(0) - '0';
        int h2 = (int)time.charAt(1) - '0';
        int hh = (h1*10 + h2);
        
        if(time.charAt(9)=='A'||time.charAt(9)=='a')
        {
            if(hh==12) System.out.print("00");
            else System.out.print(hh);
        }
        else if(time.charAt(9)=='P'||time.charAt(9)=='p')
        {
            if(hh==12) System.out.print("12");
            else System.out.print(hh+12);
        }
        else
        {
            System.out.print("Something Went wrong");
            System.exit(0);
        }
        
        for(int i=2;i<=7;i++) System.out.print(time.charAt(i));
    }
    
    
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
		System.out.println("Enter time in hh:mm:ss am/pm: ");
		String time = in.nextLine();
		getNew(time);
		
	}
}

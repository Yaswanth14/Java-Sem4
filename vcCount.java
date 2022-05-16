// Display number of vowels and consonents

import java.util.Scanner;

public class vcCount
{
    
    static void AlphaCheck(String str)
    {
    str = str.toLowerCase();
    int vcount =0, ccount =0, n = str.length();
    for(int i=0; i<n; i++)
    {
        if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') vcount++;
        else if(str.charAt(i)>'a' && str.charAt(i) <='z') ccount++;
    }
    
    System.out.println("Number of vowels = "+ vcount);
    System.out.println("Number of consonents = "+ ccount);
    }
    
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = in.nextLine();
		AlphaCheck(str);
	}
}

// Check if two strings are anagrams or not
import java.util.Scanner;
import java.util.Arrays;  

public class CheckAnagram {
    static boolean isAnagram(String str1, String str2)
    {

        str1 = str1.replaceAll("\\s", "");  
        str2 = str2.replaceAll("\\s", ""); 

        int n1 = str1.length(), n2 = str2.length();
        if(n1!=n2) return false;

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // for(int i=0; i<n1; i++)

        for(int i=0; i<n1; i++)
        if(str1.charAt(i)!=str2.charAt((i))) return false;

        return true;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = in.nextLine();
        System.out.print("Enter second string: ");
        String str2 = in.nextLine();

        if(isAnagram(str1, str2)) System.out.println("They are anagrams");
        else System.out.println("They are not anagrams");
    }
}

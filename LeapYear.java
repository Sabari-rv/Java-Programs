
package sampleprograms;

import java.util.Scanner;

/**
 *
 * @author Sabarinathan R V
 */
public class LeapYear 
{
    public static boolean check(int year)
    {
        if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) 
            return true;
	else
	    return false; 
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        LeapYear obj = new LeapYear();
        int year = sc.nextInt();
        System.out.println(obj.check(year));
    }
}

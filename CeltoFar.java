
package sampleprograms;

import java.util.Scanner;

/**
 *
 * @author Sabarinathan R V
 */
public class CeltoFar 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celcius: ");
        double cel = sc.nextDouble();
        double far = (cel * 1.8) + 32;
        System.out.println("Corresponding Farenheit is : " + far + "°F");
        
    }
}

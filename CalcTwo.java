
package sampleprograms;

import java.util.Scanner;

/**
 *
 * @author Sabarinathan R V
 */
public class CalcTwo 
{
    public int sumtwo(int a , int b) //method for adding two numbers
    {
        System.out.print("Added value: ");
        return a + b;
    }
    
    public int multwo(int a , int b) //method for multiplying two numbers
    {
        System.out.print("Product value: ");
        return a * b;
    }
    
    public int subtwo(int a , int b) //method for subtracting two numbers
    {
        System.out.print("Subtracted value: ");
        return a - b;
    }
    
    public int divtwo(int a , int b) //method for dividing two numbers
    {
        System.out.print("Subtracted value: ");
        return a / b;
    }
    
    public static void main(String[] args)
    {
        CalcTwo obj = new CalcTwo(); //Object creation
        Scanner sc = new Scanner(System.in);
        int x,y;
        
        
        System.out.println("Calculations available: \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n");
        
        System.out.println("Enter the type of calculation needed (1-4): ");
        int caltype = sc.nextInt();
        
        System.out.print("Enter first num: ");
        x=sc.nextInt();
        System.out.print("Enter second num: ");
        y=sc.nextInt();
        
        switch(caltype)
        {
                case 1:
                    System.out.print(obj.sumtwo(x, y));
                    break;
                case 2:
                    System.out.println(obj.subtwo(x, y));
                    break;
                case 3:
                    System.out.println(obj.divtwo(x, y));
                    break;
                case 4:
                    System.out.println(obj.multwo(x, y));
                    break;
        } 
    }
}

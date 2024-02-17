// Backward Slash Star Pattern.

// *
//  *
//   *
//    *
//     *
    
    
import java.util.*;
public class Main 
{
    public static void secondApproach(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                if(i == j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void firstApproach(int n)
    {
        int nsp = 0;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            nsp++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        firstApproach(n);
        System.out.println();
        secondApproach(n);
    }
}

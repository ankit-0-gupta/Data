// Cross Of Stars.

// *   *
//  * *
//   *
//  * *
// *   *


import java.util.*;
public class Main 
{
    public static void secondApproach(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j <= n; j++)
            {
                if((i == j) || (i + j == n + 1))
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
        int nspO = 0;
        int nspI = n - 2;
        for(int row = 1; row <= n; row++)
        {
            for(int cspO = 1; cspO <= nspO; cspO++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int cspI = 1; cspI <= nspI; cspI++)
            {
                System.out.print(" ");
            }
            if(row != n / 2 + 1)
            {
                System.out.print("*");                
            }
            if(row <= n / 2)
            {
                nspO++;
                nspI -= 2;
            }
            else
            {
                nspO--;
                nspI += 2;
            }
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

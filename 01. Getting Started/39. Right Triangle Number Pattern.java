// Right Triangle Number Pattern.

// 1 
// 2 3 
// 3 4 5 
// 4 5 6 7 
// 5 6 7 8 9 
    

import java.util.*;
public class Main 
{
    public static void numberPattern(int n)
    {
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            int val = row;
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(val++ + " ");
            }
            nst++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        numberPattern(n);
    }
}

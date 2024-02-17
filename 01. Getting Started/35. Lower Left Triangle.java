// Lower Left Triangle.

// Sample Input 0:
// 5
  
// Sample Output 0:
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 


import java.io.*;
import java.util.*;
public class Solution 
{
    public static void lowerLeftTriangle(int n)
    {
        int nst = 1; 
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("* ");
            }
            nst++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        lowerLeftTriangle(n);
    }
}

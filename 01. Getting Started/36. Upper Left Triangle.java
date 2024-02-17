// Upper Left Triangle.

// Sample Input 0:
// 7
  
// Sample Output 0:
// *******
// ******
// *****
// ****
// ***
// **
// *


import java.io.*;
import java.util.*;
public class Solution 
{
    public static void upperLeftTriangle(int n)
    {
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            nst--;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        upperLeftTriangle(n);
    }
}

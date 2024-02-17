// Grid Rectangle Star Pattern.

// Sample Input 1:
// m = 4
// n = 3

// Sample Output 1:
// ***
// ***
// ***
// ***
  
// Sample Input 2:
// m = 3
// n = 4

// Sample Output 2:
// ****
// ****
// ****


import java.util.*;
public class Main 
{
    public static void rectangleGrid(int m, int n)
    {
        int nst = n;
        for(int row = 1; row <= m; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        rectangleGrid(m, n);
    }
}

// Ternary Operator.


import java.util.*;
public class Main 
{   
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String result = (n % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(result);
    }
}

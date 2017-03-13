import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j;int k=n;
        while(n!=0)
            {
            for(i=1;i<n;i++)
                System.out.print(" ");
            for(j=i;j<=k;j++)
                System.out.print("#");
            System.out.println();
            n--;
            
        }
    }
}
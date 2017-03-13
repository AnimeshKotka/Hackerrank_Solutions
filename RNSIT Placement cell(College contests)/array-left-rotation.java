import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
            if(d<n){
        for(int i=d;i<n;i++) 
            System.out.print(a[i]+" ");
        for(int i=0;i<d;i++)
            System.out.print(a[i]+" ");
            }
             else
             {
        for(int i=n-1;i>=0;i--) 
            System.out.print(a[i]+" ");
    }
    }
}
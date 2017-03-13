import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0)
            {
        int n=in.nextInt();
        int k=in.nextInt();int ff=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          {  arr[i]=in.nextInt();
           if(arr[i]<=0)
               ff++;
          }
            if(ff>=k)
                System.out.println("NO");
        else
            System.out.println("YES");
        t--;
        }
    }
}
import java.io.*;
import java.util.*;
public class q1
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        arr[i]=in.nextLong();
        for(int i=0;i<n;i++)
        {
            if(arr[i]%4==0 ||arr[i]%7==0)
            {
                System.out.println("Yes");
            }
            else
            {
                if(arr[i]==0)
                System.out.println("No");
                else
                {
                long num=arr[i];
                while(num%7!=0 && num>=0)
                {
                    num=num-4;
                }
                if(num%7==0 ||num%4==0)
                System.out.println("Yes");
                else
                System.out.println("No");
            }
        }
        }
    }
}
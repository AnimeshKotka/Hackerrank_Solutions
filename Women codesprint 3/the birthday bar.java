import java.io.*;
import java.util.*;
public class rrq1
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
        int s=in.nextInt();
        int t=in.nextInt();
        int count=0;
        for(int i=0;i<=n-t;i++)
        {
            int sum=0;
            for(int j=i;j<i+t;j++)
            {
                sum+=arr[j];
            }
            if(sum==s)
            count++;
        }
        if(n==1 && arr[0]==s)
        System.out.println("1");
        else
        System.out.println(count);
    }
}
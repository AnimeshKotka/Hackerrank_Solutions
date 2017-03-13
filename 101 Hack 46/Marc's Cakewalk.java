import java.io.*;
import java.util.*;
public class hackq1
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
        Arrays.sort(arr);
        long sum=0;int j=0;
        for(int i=n-1;i>=0;i--)
        {
            sum+=arr[i]*Math.pow(2,j);
           // System.out.println("SM:"+sum);
            j++;
        }
        System.out.println(sum);
    }
}
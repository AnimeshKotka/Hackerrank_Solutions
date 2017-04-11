import java.io.*;
import java.util.*;
public class yummy_chocolate
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int flag[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
        Arrays.sort(arr);
        int bug=0;
        for(int i=0;i<n;)
        {
            bug++;int c=arr[i]+4;
            if(i>=n)
            break;
            while(arr[i]<=c)
            {
                i++;
                if(i>=n)
            break;
            }
        }
        System.out.println(bug);
    }
}

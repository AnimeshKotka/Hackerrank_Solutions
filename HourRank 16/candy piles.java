import java.io.*;
import java.util.Scanner;
public class q2
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int min,count;count=1;min=0;
        arr[0]=in.nextInt();
        min=arr[0];int index=0;
        for(int i=1;i<n;i++)
        {
            arr[i]=in.nextInt();
            if(min==arr[i])
            count++;
            if(min>arr[i])
            {
                min=arr[i];
                index=i;
            }
         }
        //System.out.println("min:"+min);
        arr[index]=2*arr[index];
         int new1=min*2;int minmum=arr[0];
        for(int i=1;i<n;i++)
        {
            if(minmum>arr[i])
            minmum=arr[i];
        }
        //System.out.println("minmun:"+minmum);
        if(minmum==new1)
        System.out.println(new1+" "+count);
        else
        System.out.println(minmum+" "+count);
    }
}
        
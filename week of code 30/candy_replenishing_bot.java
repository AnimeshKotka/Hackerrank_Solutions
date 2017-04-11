import java.io.*;
import java.util.*;
public class candy_replenishing_bot
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int size=in.nextInt();
        int arr[]=new int[size];
        int k=n;int new_candies=0;
        for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
        for(int i=0;i<size;i++)
        {
            n-=arr[i];
            if(n<5 && i!=size-1)
            {
                new_candies+=k-n;
                n=k;
            }
        }
        System.out.println(new_candies);
    }
}

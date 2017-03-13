import java.io.*;
import java.util.*;
public class uq1
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int n=in.nextInt();
        int a=in.nextInt();
        arr.add(a);
        int max=0,min=0;
        for(int i=1;i<n;i++)
        {
            a=in.nextInt();
            Collections.sort(arr);
            if(arr.get(0)>a)
            min++;
            if(arr.get(i-1)<a)
            max++;
            arr.add(a);
        }
        System.out.println(max+" "+min);

    }
}
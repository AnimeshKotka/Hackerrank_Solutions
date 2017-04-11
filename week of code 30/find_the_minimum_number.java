import java.io.*;
import java.util.*;
public class find_the_minimum_number
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str="min(int, int)";
        for(int i=3;i<=n;i++)
        {
            str="min(int, "+str+")";
        }
        System.out.println(str);
    }
}
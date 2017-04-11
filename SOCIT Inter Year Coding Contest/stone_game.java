import java.io.*;
import java.util.*;
public class stone_game
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int len=str.length();
        int first=0;
        for(int j=len-1;j>=0;j--)
        {
            if(str.charAt(j)=='o')
            {
                int k=len-j;
                if(first==0)
                {
                  if(k%2==0)
                   first=1;
                   else
                   first=0;
                }
                else
                {
                    if(k%2==0)
                    first=0;
                    else
                    first=1;
                }
            }
        }
        if(first==0)
        System.out.println("NO");
        else
        System.out.println("YES");
        
    }
}
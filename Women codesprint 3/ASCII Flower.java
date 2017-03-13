import java.io.*;
import java.util.*;
public class rrq2
{
    public static void main(String args[])throws IOException
    {
       Scanner in=new Scanner(System.in);
       int r=in.nextInt();
       int c=in.nextInt();
       String str[]=new String[3];
       str[0]="";
       str[1]="";
       str[2]="";
       for(int i=1;i<=c;i++)
       {
           str[0]+="..O..";
           str[1]+="O.o.O";
           str[2]+="..O..";
       }
       for(int i=1;i<=r;i++)
       {
           System.out.println(str[0]);
           System.out.println(str[1]);
           System.out.println(str[2]);
       }
    }
}
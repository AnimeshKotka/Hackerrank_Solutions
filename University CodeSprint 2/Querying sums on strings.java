import java.io.*;
import java.util.*;
public class uq6
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        uq6 ob=new uq6();
        int n,m,q,k;
        n=in.nextInt();
        m=in.nextInt();
        q=in.nextInt();
        k=in.nextInt();
        String str=in.next();
        int arr[][]=new int[m][2];
        for(int i=0;i<m;i++)
        {
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
        }
        String s[]=new String[q];
        int a[]=new int[q];
        int b[]=new int[q];
        for(int i=0;i<q;i++)
        {
            s[i]=in.next();
            a[i]=in.nextInt();
            b[i]=in.nextInt();
        }
        long sum=0;
        for(int i=0;i<q;i++)
        {
            sum=0;
            for(int j=a[i];j<=b[i];j++)
            {
                String w=s[i].substring(arr[j][0],arr[j][1]+1);
                int f=ob.findans(str,w);
                if(f!=-1)
                sum+=f;
            }
            System.out.println(sum);
        }
    }
    int findans(String str,String w)
    {
        int index = str.indexOf(w);
        int m=w.length();
       // System.out.println("INDEX:"+index);
        int count = 0;
        while (index != -1)
        {
        count++;
        //System.out.println("STR:"+str+"\t"+"W:"+w+"\t"+"COUNT:"+count);
        //System.out.println("idex:"+index);
        int l=str.length();
        if(index+m>l)
        break;
        str = str.substring(index + m,l);
        index = str.indexOf(w);
        }
        return count;
    }
}
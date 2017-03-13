import java.io.*;
import java.util.*;
public class uq5
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0)
        {
            String str=in.next();
            int len=str.length();
            if(len==1)
            System.out.println("NO");
            else
            {
                String s1="",s2="";long num1,num2;
                for(int i=0;i<=len/2;i++)
                {
                    int flag=0;
                    s1=str.substring(0,i+1);
                   // System.out.println("s1:"+s1);
                    num1=Long.parseLong((s1));
                    num2=num1+1;
                    s2=Long.toString(num2);
                   // System.out.println("s2:"+s2);
                    int k=i+1;
                    while(flag==0)
                    {
                        int l=s2.length();
                        if(k+l>len)
                        {
                            flag=1;
                            break;
                        }
                       // System.out.println("above"+str.substring(k,k+l)+"\t"+"llength:"+l+"\t"+"I:"+i);
                        if((str.substring(k,k+l).equals(s2)))
                        {
                            //System.out.println(str.substring(k+1,k+1+l));
                            flag=0;
                            num2++;
                            k=k+l;
                            //if(k==len-1)
                            //break;
                            if(k==len)
                            break;
                         //   System.out.println("num2:"+num2);
                            s2=Long.toString(num2);
                           // System.out.println("S2 in:"+s2);
                            l=s2.length();
                          //  System.out.println("K:"+k);
                           // if(k==len-1)
                           // break;
                           // if(k+l==len)
                           // break;
                            if(k+1>len)
                            {
                               // System.out.println("here");
                                flag=1;
                                break;
                            }
                        }
                        else
                        {
                            flag=1;
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("YES"+" "+s1);
                        break;
                    }
                    else
                    if(flag==1 && i>len/2-1)
                    {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            t--;
        }
    }
}
        
        
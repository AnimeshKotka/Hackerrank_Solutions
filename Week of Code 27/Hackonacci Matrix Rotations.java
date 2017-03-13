import java.io.*;
import java.math.*;
import java.util.Scanner;
public class weekq3OPTIMISED
{
 public static void main(String args[])throws IOException
        {
        Scanner in=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out, true);
        int n,q;
        n=in.nextInt();
        q=in.nextInt();
        int query[]=new int[q];
        char check_odd_even[]={'Y','X','Y','X','X','Y','X'};
        char hacko[][]=new char[n][n];
        char hackorotated90[][]=new char[n][n];int c1=0;
        char hackorotated180[][]=new char[n][n];int c2=0;int c0=0;
        char hackorotated270[][]=new char[n][n];int c3=0;
        for(int i=0;i<q;i++)
        {
            query[i]=in.nextInt();
            query[i]=query[i]%360;
        }
        weekq3OPTIMISED ob=new weekq3OPTIMISED();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                char store;
                long index=(long)Math.pow(((i+1)*(j+1)),2);
                if(index%7==0)
                store=ob.createHacko(check_odd_even,index);
                else
                store=ob.createHacko(check_odd_even,index-1);
                hacko[i][j]=hacko[j][i]=store;
            }
        }
       hackorotated90=ob.rotateHacko(hacko,n);
       hackorotated180=ob.rotateHacko(hackorotated90,n);
       hackorotated270=ob.rotateHacko(hackorotated180,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(hackorotated90[i][j]!=hacko[i][j])
                c1++;
                if(hackorotated180[i][j]!=hacko[i][j])
                c2++;
                if(hackorotated270[i][j]!=hacko[i][j])
                c3++;
            }
        }
        for(int i=0;i<q;i++)
        {
        int check=query[i]/90;
        if(check==0)
        pw.println(c0);
        if(check==1)
        pw.println(c1);
        if(check==2)
        pw.println(c2);
        if(check==3)
        pw.println(c3);
        }
  }
    char createHacko(char set[],long size)
    {
     long ind=size%7;
     int index=(int)ind;
     return set[index];
    }
    char[][] rotateHacko(char rr[][],int size)
    {
        char mtrix[][]=new char[size][size];
      for (int r = 0; r < size; r++) {
        for (int c = 0; c < size; c++) {
            mtrix[c][size-1-r] = rr[r][c];
        }
    }
    return mtrix;
}   
}     
   
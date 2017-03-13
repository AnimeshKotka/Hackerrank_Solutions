import java.io.*;
import java.util.*;
public class weekq7
{
        public static void main(String args[])throws IOException
        {
        String str;
        Scanner in=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out, true);
        weekq7 ob=new weekq7();
        int n,q;
        n=in.nextInt();
        q=in.nextInt();
        int arr[][]=new int[n][2];
        str=in.next();
        for(int i=0;i<q;i++)
        for(int j=0;j<2;j++)
        arr[i][j]=in.nextInt();
        for(int i=0;i<q;i++)
       {
           ob.total(str.substring(arr[i][0],arr[i][1]+1)gs,arr[i][1]-arr[i][0]+1);
       }
    }
        void total(String st,int length)
        {
        int all=length*(length+1)/2;
        int count=0;String last="";
        String subs[]=new String[all];
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<=length;j++)
            {
                if(st.substring(i,j)!=st)
                {
                subs[count]=st.substring(i,j);
                count++;
                }
            }
            last=last+st.charAt(i);
        }
        subs[count]=last;
         count++;
       // for(int i=0;i<count;i++)
       // System.out.print(subs[i]+"\t");
       // System.out.println();
        sortA(subs,count-1);
       // if(last.compareTo(st)!=0)
       // {
        //    subs[count]=last;
          //  count++;
        //}
       //  for(int i=0;i<count;i++)
      //  System.out.print(subs[i]+"\t");
      //  System.out.println();
         System.out.println(counttotal(subs,count));
    }
    private static int counttotal(String subs1[],int size)
       {
        int count;
        count=1;
        for(int i=1;i<size;i++)
        {
            if(subs1[i].compareTo(subs1[i-1])!=0)
            {
              count+=1;
        }
        }
            return count;
        }
        private static void sortA(String[] arr,int size)
    {
        quickSort(arr, 0,size);
    }
    /** Quick sort function **/
    private static void quickSort(String arr[], int low, int high) 
    {
        int i = low, j = high;
        String temp;
        String pivot = arr[(low + high) / 2];
 
        /** partition **/
        while (i <= j) 
        {
            while (arr[i].compareTo(pivot)<0)
                i++;
            while (arr[j].compareTo(pivot)>0)
                j--;
            if (i <= j) 
            {
                /** swap **/
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
                j--;
            }
        }
 
        /** recursively sort lower half **/
        if (low < j)
            quickSort(arr, low, j);
        /** recursively sort upper half **/
        if (i < high)
            quickSort(arr, i, high);
    }
}

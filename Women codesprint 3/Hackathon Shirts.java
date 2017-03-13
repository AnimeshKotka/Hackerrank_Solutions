import java.io.*;
import java.util.*;
public class tshirt
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
            int v=in.nextInt();
            int vendor[][]=new int[v][2];
            for(int i=0;i<v;i++)
            for(int j=0;j<2;j++)
            vendor[i][j]=in.nextInt();
            Arrays.sort(arr);
           Arrays.sort(vendor,new Comparator<int []>(){
            @Override
            public int compare(final int[] entry1,final int[] entry2 ){
                if(entry1[0]>entry2[0]) return 1;
                else
                if(entry1[0]==entry2[0] && entry1[1]<=entry2[1])
                return 1;
                else
                return -1;
            }});
           int count=0;
           for(int i=0;i<n;i++)
           {
               int k=search(vendor,v,arr[i]);
               if(k==1)
               count+=1;
            }
           System.out.println(count);
           t--;
        }
    }
    public static int search(int arr[][],int v,int k)
    {
        int lo=0,high=v;int mid=(lo+high)/2;
        while(lo<=high)
        {
         mid=(lo+high)/2;
         if(arr[mid][0]<=k && arr[mid][1]>=k)
         return 1;
         else
         if(arr[mid][0]>k)
         high=mid-1;
         else
         if(arr[mid][1]<k)
         lo=mid+1;
        }
        return -1;
    }
}
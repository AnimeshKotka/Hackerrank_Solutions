import java.io.*;
import java.util.*;
public class hackq1
{
    static int min,max=0;
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String dna[]=new String[n];
        int health[]=new int[n];
        hackq1 ob=new hackq1();
        for(int i=0;i<n;i++)
        dna[i]=in.next();
        for(int i=0;i<n;i++)
        health[i]=in.nextInt();
        min=Integer.MAX_VALUE;
        //ob.quicksort(dna,0,n-1,health);
        /*for(int i=0;i<n;i++)
        System.out.print(dna[i]+"\t");
        System.out.println();
        for(int i=0;i<n;i++)
        System.out.println(health[i]+"\t");*/
        int k=in.nextInt();
        int first[]=new int[k];
        int last[]=new int[k];
        String sample[]=new String[k];
        for(int i=0;i<k;i++)
        {
            first[i]=in.nextInt();
            last[i]=in.nextInt();
            sample[i]=in.next();
        }
        for(int i=0;i<k;i++)
        {
            ob.calculate(dna,first[i],last[i],sample[i],health);    
        
        }
        System.out.println(min+" "+max);
    }
    void calculate(String dna[],int f,int l,String s,int h[])
    {
        int len=s.length();String t="";int sum=0;
        for(int j=0;j<len;j++)
        {
            t="";
            for(int i=j;i<len;i++)
            {
                char c=s.charAt(i);
                t+=c;
                int k=search(dna,f,l,t);
               // System.out.println(k);
                if(k!=-1)
                {
                    while(k!=-1)
                    {
                        sum+=h[k];
                         //System.out.println(sum);
                        k=search(dna,k+1,l,t);
                    }
                }
               // System.out.println(sum);
            }
        }
        if(sum>max)
        max=sum;
        if(sum<min)
        min=sum;
    }
    int search(String[] inputArr, int low,int high,String key)
    {
        int flag=0;
	    for(int i=low;i<=high;i++)
	    {
	      if(inputArr[i].compareTo(key)==0)
	      {
	          flag=1;
	          return i;
           }
	    }
	    if(flag==0)
	    return -1;
	    else
	    return 1;
	}
    void quicksort(String arr[], int low, int high,int h[]) 
    {
        int i = low, j = high;
        int temp;String t;
        String pivot = arr[(low + high) / 2];
 
        /** partition **/
        while (i < j) 
        {
            while (arr[i].compareTo(pivot) < 0)
                i++;
            while (arr[j].compareTo(pivot) > 0)
                j--;
            if (i <= j) 
            {
                /** swap **/
                t = arr[i];temp=h[i];
                arr[i] = arr[j];h[i]=h[j];
                arr[j] = t;h[j]=temp;
 
                i++;
                j--;
            }
        }
        /** recursively sort lower half **/
        if (low < j)
            quicksort(arr,low,j,h);
        /** recursively sort upper half **/
        if (i < high)
            quicksort(arr, i, high,h);
    }
}
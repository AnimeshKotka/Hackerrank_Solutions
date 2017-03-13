import java.io.*;
import java.util.*;
public class recipe
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int q,r,p,n,m;
        q=in.nextInt();
        while(q!=0)
        {
            int c=0;
            r=in.nextInt();
            p=in.nextInt();
            n=in.nextInt();
            m=in.nextInt();
            int present[]=new int[m];
            for(int i=0;i<m;i++)
            present[i]=in.nextInt();
            int cost[]=new int[p];
            for(int i=0;i<p;i++)
            cost[i]=in.nextInt();
            int book[][]=new int[r][p];
            int maintain[][]=new int[r][p];
            int cheap[][]=new int[r][2];
            int cheapdummy[]=new int[r];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<p;j++)
                book[i][j]=in.nextInt();
            }
            int f=0,ff=0;
             for(int i=0;i<r;i++)
             {
                f=0;c=0;
                for(int j=0;j<p;j++)
                {
                    if(book[i][j]==1)
                    {
                        int w=binarySearch(present,j);
                        if(w==-1)
                        {
                            c+=cost[j];
                            maintain[i][f]=j+1;
                            f++;
                        }
                    }
                }
                if(f==0)
                n-=1;
                cheap[ff][0]=ff;
                cheap[ff][1]=c;
                cheapdummy[ff]=c;
                ff++;
            }
            q--;
            if(n==0)
            {
                System.out.println("0");
                System.exit(0);
            }
            ArrayList<Integer> finale=new ArrayList<Integer>(); 
            Arrays.sort(cheap,new Comparator<int []>(){
            @Override
            public int compare(final int[] entry1,final int[] entry2 ){
                if(entry1[1]>entry2[1]) return 1;
                else
                if(entry1[1]==entry2[1] && entry1[0]>entry2[0])
                return 1;
                else
                return -1;
            }});
            /*for(int i=0;i<r;i++)
            {
                System.out.println(cheap[i][0]+"   "+cheap[i][1]);
            }*/
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<p;j++)
                {
                    if(maintain[cheap[i][0]][j]!=0)
                    finale.add(maintain[cheap[i][0]][j]-1);
                    else
                    break;
                }
            }
            Collections.sort(finale);
            int summation=cost[finale.get(0)];
            int len=finale.size();
            for(int i=1;i<len;i++)
            {
                if(finale.get(i)!=finale.get(i-1))
                summation+=cost[finale.get(i)];
            }
            /*for(int i=0;i<r;i++)
            {
                for(int j=0;j<p;j++)
                System.out.print(maintain[i][j]+"\t");
                System.out.println();
            }*/
            System.out.println(summation);
        }
    }
    public static int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
            
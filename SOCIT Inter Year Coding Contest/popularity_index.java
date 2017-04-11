import java.io.*;
import java.util.*;

public class popularity_index
 {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            String s=in.next();
            for(int j=0;j<n;j++)
                if(s.charAt(j)=='Y'){
                    arr[i][j]=1;
                    arr[j][i]=1;
            }
        }
        int maxx=0;
        for(int i=0;i<n;i++){
            int arr2[]=new int[n];
            for(int j=0; j<n; j++){
                if(arr[i][j]!=1)
                    continue;
                arr2[j]=1;
                for(int k=0;k<n;k++)
                    if(arr[j][k]==1)
                        arr2[k]=1;
            }
            
            
            int count=-1;
            for (int j=0; j<n; j++)
                if(arr2[j]==1)
                    count++;
                
                
            maxx = (count > maxx) ? count : maxx;
        }
        System.out.println (maxx);
    }
}
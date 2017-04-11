import java.io.*;
import java.util.*;

public class Tree_2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        if((Math.pow(2,n-k)+1<=k))
            System.out.println("Possible");
        else
            
            System.out.println("Impossible");
    }
}
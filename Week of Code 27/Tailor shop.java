import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int buttons[] = new int[n];
        for(int i=0;i<n;i++){
            buttons[i] = a[i]/p + (a[i]%p!=0?1:0);
        }
        Arrays.sort(buttons);
        //System.out.println("Buttons "+Arrays.toString(buttons));
        int h[] = Arrays.copyOfRange(a,0,n);
        int ans[] = new int[n];
        ans[0] = buttons[0];
        long fans = ans[0];
        for(int i=1;i<n;i++){
            ans[i] = buttons[i];
            if(buttons[i]==buttons[i-1]){
                ans[i] = ans[i-1]+1;
            }
            else{
                ans[i] = Math.max(ans[i-1]+1,buttons[i]);
            }
            fans = fans+ans[i];
        }
        System.out.println(fans);
    }
}
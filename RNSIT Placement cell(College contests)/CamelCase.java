import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k=1;
        int len=s.length();
        for(int i=1;i<len;i++)
            if(Character.isUpperCase(s.charAt(i)))
            k+=1;
            System.out.println(k);
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        

		Scanner deep = new Scanner(System.in);
		int n = deep.nextInt();
		int p = deep.nextInt();
		n = n / 2;
		p = p / 2;
		System.out.println(p < (n - p) ? p : (n - p));
		deep.close();

	
    }
}
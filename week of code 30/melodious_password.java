import java.io.*;
import java.util.*;
class melodious_password
 {
    static int len;
    public static void main(String[] args)throws IOException {
        Scanner in=new Scanner(System.in);
        char set1[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','z'};
        int k = in.nextInt();
        len=k;
        printAllKLength(set1, k);int count=0;
    }
      static void printAllKLength(char set[], int k) {
        int n = set.length;        
        printAllKLengthRec(set, "", n, k);
    }
    static void printAllKLengthRec(char set[], String prefix, int n, int k) {
        
               if (k == 0) {
            String kk=prefix;
            int flag=0;
            for(int j=0;j<len-1;j++)
            {
                if(((kk.charAt(j)!='a' && kk.charAt(j)!='e' && kk.charAt(j)!='i' && kk.charAt(j)!='o' && kk.charAt(j)!='u')) && (kk.charAt(j+1)!='a' && kk.charAt(j+1)!='e' && kk.charAt(j+1)!='i'&& kk.charAt(j+1)!='o'&& kk.charAt(j+1)!='u'))
                {
                    flag=1;
                    break;
                }
                else
                if((kk.charAt(j)=='a'||kk.charAt(j)=='e' || kk.charAt(j)=='i' || kk.charAt(j)=='o' || kk.charAt(j)=='u') && (kk.charAt(j+1)=='a' || kk.charAt(j+1)=='e' || kk.charAt(j+1)=='i' || kk.charAt(j+1)=='o' || kk.charAt(j+1)=='u'))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
            System.out.println(kk);
            return;
        }
        return;
        }
        for (int i = 0; i < n; ++i) {
            
                 String newPrefix = prefix + set[i]; 
                 printAllKLengthRec(set, newPrefix, n, k - 1); 
        }
    }
}
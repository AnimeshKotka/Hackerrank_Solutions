import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static Long[] calcPrefSums(int[] xs) {
        Long[] prefSums = new Long[xs.length];
        for (int i = 0; i < xs.length; i++) {
            if (i == 0) {
                prefSums[0] = (long) xs[0];
            } else {
                prefSums[i] = prefSums[i - 1] + xs[i];
            }
        }
        return prefSums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int i = 0; i < m; i++) {
                b[i] = in.nextInt();
            }

            Long[] aPrefSums = calcPrefSums(a);
            Long[] bPrefSums = calcPrefSums(b);

            if ((long) n * m < 1000000) {
                int optimalRes = 0;
                for (int ac = 0; ac <= n; ac++) {
                    for (int bc = 0; bc <= m; bc++) {
                        long cur = 0;
                        if (ac > 0) {
                            cur += aPrefSums[ac - 1];
                        }
                        if (bc > 0) {
                            cur += bPrefSums[bc - 1];
                        }
                        if (cur <= x && ac + bc > optimalRes) {
                            optimalRes = ac + bc;
                        }
                    }
                }
                System.out.println(optimalRes);
                continue;
            }

            int ac, bc;
            int optimalRes = 0;
            for (ac = 0; ac <= n; ac++) {
                long rest = x;
                if (ac > 0) {
                    rest -= aPrefSums[ac - 1];
                }
                if (rest < 0) {
                    break;
                }
                bc = Arrays.binarySearch(bPrefSums, 0, m, rest);
                if (bc >= 0) {
                    bc++;
                } else {
                    bc = -(bc + 1);
                }
                int currentRes = ac + bc;
                if (optimalRes < currentRes) {
                    optimalRes = currentRes;
                }
            }
            System.out.println(optimalRes);
        }
    }
}
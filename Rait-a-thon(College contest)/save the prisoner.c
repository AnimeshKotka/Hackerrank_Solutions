#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int t;
    scanf("%d", &t);
    for(int i=0; i<t; i++){
        long int n, m, s;
        scanf("%ld %ld %ld", &n, &m, &s);
        long int x = (s+m-1)%n;
        if(!x){
            x = n;
        }
        printf("%ld\n", x);
    }
    return 0;
}
import itertools
import math
def ruleAscLen(n, l):
    arr = [0 for i in range(n + 1)]
    kk = 1
    arr[0] = 0
    arr[1] = n
    while kk > 0:
        x = arr[kk - 1] + 1
        y = arr[kk] - 1
        kk -= 1
        while x <= y and kk < l - 1:
            arr[kk] = x
            y -= x
            kk += 1
        arr[kk] = x + y
        if( kk< (l-1)):
            break;
        yield arr[:kk + 1]

n,kk = input().strip().split(' ')
n,kk = [int(n),int(kk)]
pointList =[]
for a0 in range(n):
    x_i,w_i = input().strip().split(' ')
    x_i,w_i = [int(x_i),int(w_i)]
    pointList.append((x_i,w_i))

minimumcost = 99999999999999999999999

for expression in ruleAscLen(n,kk):
    for setList in itertools.permutations(expression):
        ii = 0
        ind =0
        c = 0
        o = 0
        for size  in setList:
            (xIndice,yIndice) = pointList[ind]
            while ii < size + o :
                (x,w) = pointList[ii]
                c = c + w * (x - xIndice)
                ii = ii + 1
            ind = ii
            o = o + size
        minimumcost = min(minimumcost,c)
if minimumcost == 99999999999999999999999 :
    minimumcost = 0
print (minimumcost)
str,dex,int,luk,n = map(int,input().split())
sum = str + dex + int + luk
if n*4 >sum:
    print( n*4 -sum )
else:
    print(0)

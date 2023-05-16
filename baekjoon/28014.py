n = int(input())
top = list(map(int,input().split()))
count=1
for i in range(n-1):
    if(top[i]<=top[i+1]): //같은 높이일때도 밀어야함
        count= count + 1

print(count)

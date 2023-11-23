n = int(input())
B = 0
A = ''
for i in range(n):
    a = int(input())
    for j in range(a):
        a,b = input().split()
        if int(b) > B:
            B = int(b)
            A = a
    print(A)

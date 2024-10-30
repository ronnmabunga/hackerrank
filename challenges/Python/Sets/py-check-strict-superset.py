# Enter your code here. Read input from STDIN. Print output to STDOUT
A = set(map(int, input().split(" ")))
n = int(input())
x = True
for i in range(n):
    B = set(map(int, input().split(" ")))
    C = A.copy()
    C.difference_update(B)
    B.difference_update(A)
    if len(C) > 0:
        if len(B) != 0:
            x = False
    else:
        x = False
if x == True:
    print("True")
else:
    print("False")

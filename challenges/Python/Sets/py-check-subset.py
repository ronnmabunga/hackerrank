# Enter your code here. Read input from STDIN. Print output to STDOUT
T = int(input())
for i in range(T):
    A = input()
    A = set(map(int, input().split(" ")))
    B = input()
    B = set(map(int, input().split(" ")))
    A.difference_update(B)
    if len(A) == 0:
        print("True")
    else:
        print("False")

# Enter your code here. Read input from STDIN. Print output to STDOUT
A = input()
A = set(map(int, input().split(' ')))
N = int(input())
for i in range(N):
    command = input().split(' ')[0]
    B = set(map(int, input().split(' ')))
    if command == "intersection_update":
        A.intersection_update(B)
    elif command == "update":
        A.update(B)
    elif command == "symmetric_difference_update":
        A.symmetric_difference_update(B)
    elif command == "difference_update":
        A.difference_update(B)
sum = 0
for i in A:
    sum += i
print(sum)

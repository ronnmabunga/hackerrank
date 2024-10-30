# Enter your code here. Read input from STDIN. Print output to STDOUT
A = input()
setA = set(map(int, input().split()))
B = input()
setB = set(map(int, input().split()))
print(len(setA.union(setB)))

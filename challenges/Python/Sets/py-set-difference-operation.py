# Enter your code here. Read input from STDIN. Print output to STDOUT
n = input()
n = set(map(int, input().split(" ")))
b = input()
b = set(map(int, input().split(" ")))
print(len(n.difference(b)))

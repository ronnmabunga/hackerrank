# Enter your code here. Read input from STDIN. Print output to STDOUT
n,m = map(int, input().split(' '))
x = map(int, input().split(' '))
a = set(map(int, input().split(' ')))
b = set(map(int, input().split(' ')))
c = 0
for xs in x:
    if xs in a:
        c = c + 1
    elif xs in b:
        c = c - 1
print(c)

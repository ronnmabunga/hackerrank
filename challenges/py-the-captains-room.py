# Enter your code here. Read input from STDIN. Print output to STDOUT
A = input()
A = map(int, input().split())
B = set()
X = set()
for a in A:
    if a in B:
        if a in X:
            X.remove(a)
    else:
        X.add(a)
        B.add(a)
print(str(X)[1:len(X)-2])

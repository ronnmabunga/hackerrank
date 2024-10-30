# Enter your code here. Read input from STDIN. Print output to STDOUT
A = input()
setA = set(input().split(" "))
B = input()
setB = set(input().split(" "))
sym = []
for a in setA:
    if not a in setB:
        sym.append(int(a))
for b in setB:
    if not b in setA:
        sym.append(int(b))
sym = sorted(sym)
for s in sym:
    print(s)

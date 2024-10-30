# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
s = set(map(int, input().split()))
m = int(input())
for i in range(m):
    cmdStatement = input().split(" ")
    cmd = cmdStatement[0]
    value = None
    if len(cmdStatement) > 1:
        value = int(cmdStatement[1])
    if cmd == "pop":
        try:
            s.pop()
        except:
            pass
    elif cmd == "remove":
        try:
            s.remove(value)
        except:
            pass
    elif cmd == "discard":
        s.discard(value)
tot = 0
for x in s:
    tot += int(x)
print(tot)

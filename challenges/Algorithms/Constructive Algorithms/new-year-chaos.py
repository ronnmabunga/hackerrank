# Enter your code here. Read input from STDIN. Print output to STDOUT


def bribes():
    n = int(input())
    A = list(map(int, input().split()))
    c = 0
    for i in range(n - 1, -1, -1):
        k = A[i]
        if k - i - 1 > 2:
            print("Too chaotic")
            return
        for j in range(max(0, k - 2), i + 1):
            o = A[j]
            if o > k:
                c += 1
    print(c)


t = int(input())
for i in range(t):
    bribes()

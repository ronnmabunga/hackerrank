n = int(input())
x = list(map(float, input().split()))
y = list(map(float, input().split()))

xp = 0
yp = 0

for i in range(n):
    xp += x[i]
    yp += y[i]

xp = xp / n
yp = yp / n

xs = 0
ys = 0

for i in range(n):
    xs += (xp - x[i]) ** 2
    ys += (yp - y[i]) ** 2

xs = (xs / n) ** 0.5
ys = (ys / n) ** 0.5

p = 0

for i in range(n):
    p += (x[i] - xp) * (y[i] - yp)

p = p / (n * xs * ys)

print("%.3f" % p)

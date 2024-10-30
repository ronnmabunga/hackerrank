def average(array):
    # your code goes here
    s = set(array)
    tot = 0
    for x in s:
        tot += int(x)
    return tot / len(s)


if __name__ == "__main__":
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)

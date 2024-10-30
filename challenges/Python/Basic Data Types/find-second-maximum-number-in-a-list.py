if __name__ == "__main__":
    n = int(input())
    arr = map(int, input().split())
    arr = sorted(arr)
    M = arr[len(arr) - 1]
    for i in range(len(arr) - 1, -1, -1):
        if M > arr[i]:
            print(arr[i])
            break

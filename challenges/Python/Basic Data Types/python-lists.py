if __name__ == "__main__":
    N = int(input())
    l = []
    for i in range(N):
        j = input().split(" ")
        cmd = j[0]
        if cmd == "insert":
            l.insert(int(j[1]), int(j[2]))
        elif cmd == "print":
            print(l)
        elif cmd == "remove":
            l.remove(int(j[1]))
        elif cmd == "append":
            l.append(int(j[1]))
        elif cmd == "sort":
            l.sort()
        elif cmd == "pop":
            l.pop()
        elif cmd == "reverse":
            l.reverse()

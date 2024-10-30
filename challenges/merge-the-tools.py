def merge_the_tools(s, k):
    # your code goes here
    lis = []
    i = 0
    while i < len(s):
        lis.append(s[i:i+k])
        i += k
    for j in range(len(lis)):
        temp = ""
        for m in range(k):
            if not lis[j][m] in temp:
                temp = temp + lis[j][m]
        print(temp)

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
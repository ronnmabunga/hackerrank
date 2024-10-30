if __name__ == "__main__":
    nl = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        l = [score, name]
        nl.append(l)
    nl.sort(key=lambda x: x[0])
    LowestScore = None
    secondLowestScore = None
    for i in nl:
        if not LowestScore:
            LowestScore = i[0]
        elif not (i[0] == LowestScore):
            secondLowestScore = i[0]
            break
    slss = []
    for i in nl:
        if i[0] == secondLowestScore:
            slss.append(i[1])
    slss.sort()
    for i in slss:
        print(i)

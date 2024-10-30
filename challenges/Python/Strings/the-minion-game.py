def minion_game(string):
    # your code goes here
    vowels = "AEIOU"
    string = list(string)
    Kevin = 0
    Stuart = 0
    length = len(string)
    for i in range(len(string)):
        if string[i] in vowels:
            Kevin += length - i
        else:
            Stuart += length - i
    if Kevin > Stuart:
        print("Kevin " + str(Kevin))
    elif Kevin < Stuart:
        print("Stuart " + str(Stuart))
    else:
        print("Draw")


if __name__ == "__main__":
    s = input()
    minion_game(s)

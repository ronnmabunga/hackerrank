if __name__ == '__main__':
    s = input()
    hasAlphaNum = False
    hasAlpha = False
    hasDig = False
    hasLower = False
    hasUpper = False
    for i in s:
        if i.isalnum():
            hasAlphaNum = True
        if i.isalpha():
            hasAlpha = True
        if i.isdigit():
            hasDig = True
        if i.islower():
            hasLower = True
        if i.isupper():
            hasUpper = True
    
    print(hasAlphaNum)
    print(hasAlpha)
    print(hasDig)
    print(hasLower)
    print(hasUpper)


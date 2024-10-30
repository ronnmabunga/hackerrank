def swap_case(s):
    result = ""
    for i in s:
        ch = ord(i)
        if ch >= ord("a") and ch <= ord("z"):
            result += chr(ch - ord("a") + ord("A"))
        elif ch >= ord("A") and ch <= ord("Z"):
            result += chr(ch - ord("A") + ord("a"))
        else:
            result += i
    return result


if __name__ == "__main__":
    s = input()
    result = swap_case(s)
    print(result)

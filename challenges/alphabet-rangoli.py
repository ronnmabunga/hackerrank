def letter(number):
    return chr(int(number) - 1 + ord('a'))
def print_rangoli(s):
    # your code goes here
    c = letter(s)
    s = int(s) - 1
    for i in range (2*s+1):
        if i == s:
            margin = ('-'*(s-i)*2)
            left = ""
            right = ""
            for j in range (s+1,s-i+1,-1):
                left = left + letter(j) + '-'
                right = '-' + letter(j) + right
            print(margin + left + letter(s-i+1) + right + margin)
        if i < s:
            margin = ('-'*(s-i)*2)
            left = ""
            right = ""
            for j in range (s+1,s-i+1,-1):
                left = left + letter(j) + '-'
                right = '-' + letter(j) + right
            print(margin + left + letter(s-i+1) + right + margin)
        if i > s:
            margin = ('-'*(i-s)*2)
            left = ""
            right = ""
            for j in range (s+1,i-s+1,-1):
                left = left + letter(j) + '-'
                right = '-' + letter(j) + right
            print(margin + left + letter(i-s+1) + right + margin)
if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
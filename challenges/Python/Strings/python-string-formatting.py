def print_formatted(n):
    # your code goes here
    l = len(str(bin(n)[2:]))
    for i in range(1, n + 1):
        print(
            ("{:" + str(l) + "d} ").format(int(i))
            + ("{:>" + str(l) + "s} ").format(oct(i)[2:])
            + ("{:>" + str(l) + "s} ").format(hex(i)[2:].upper())
            + ("{:>" + str(l) + "s}").format(bin(i)[2:])
        )


if __name__ == "__main__":
    n = int(input())
    print_formatted(n)

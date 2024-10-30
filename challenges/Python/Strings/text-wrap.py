import textwrap


def wrap(string, max_width):
    count = 0
    strs = ""
    while count < len(string):
        if string[count : count + max_width] is not None:
            strs += (string[count : count + max_width]) + "\n"
        count += max_width
    return strs


if __name__ == "__main__":
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)

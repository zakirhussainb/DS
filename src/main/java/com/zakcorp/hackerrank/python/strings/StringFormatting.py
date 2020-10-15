def print_formatted(number):
    w = len(str(bin(number)).replace('0b', ''))
    for i in range(1, number + 1):
        d = str(i).rjust(w, ' ')
        o = oct(int(i)).replace('0o', '').rjust(w, ' ')
        h = hex(int(i)).replace('0x', '').upper().rjust(w, ' ')
        b = bin(int(i)).replace('0b', '').rjust(w, ' ')
        print(d, o, h, b)


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
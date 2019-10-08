def main():
    f = 1

    n = int(input())
    print("Hello HacktoberFest!")

    if n > 0:
        for i in range(1, n+1):
            f *= i

    print("fatorial(" + str(n) + ") = " + str(f))


if __name__ == "__main__":
    main()

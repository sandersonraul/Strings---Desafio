inputs_number = int(input())
while n > 0:
    inputs_number -= 1
    numbers = input().split()
    numbers.sort(key=len, reverse=True)
    for i in range(len(numbers)):
        print(numbers[i], end = '')
        if i != len(numbers)-1:
            print(' ', end = '')
    print()

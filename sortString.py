inputs_number = int(input())
a = []
while inputs_number > 0:
    inputs_number -= 1
    numbers = input().split()
    numbers.sort(key=len, reverse=True)
    a.append(numbers)

print()

for s in a:
    print(*s)

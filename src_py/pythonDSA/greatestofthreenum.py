number1 = 29
number2 = 40
number3 = 60

if (number1 >= number2) and (number1 >= number3):
    largest = number1
elif (number2 >= number1) and (number2 >= number3):
    largest = number2
else:
    largest = number3

print(largest, "is the greatest number.")
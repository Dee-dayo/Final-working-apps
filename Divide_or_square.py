def divide_or_square(number):
	if number % 5 == 0:
        	return number ** 0.5
	else:
		return number % 5

test = divide_or_square(10)
print(test)

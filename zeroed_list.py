def zeroed_code(int_list):
	int_list[0] = 0
	int_list[len(int_list)-1] = 0

numbers = [2, 5, 7, 8, 9]
zeroed_code(numbers)

print (numbers)
def check_duplicates(string_list):
	items_seen = set()
	already_in_list = set()

	for element in string_list:
		if element in items_seen:
			already_in_list.add(element)
		else:
			items_seen.add(element)

	if already_in_list:
		return list(already_in_list)
	else:
		return '"No duplicates"'


list_of_items = ["apple", "orange", "grape", "banana", "apple", "grape"]
result = check_duplicates(list_of_items)
print(result)

fruits = ['apple', 'orange', 'banana', 'apple']
answer = check_duplicates(fruits)
print(answer)

names = ['Yoda', 'Moses', 'Joshua', 'Mark']
answer2 = check_duplicates(names)
print(answer2)
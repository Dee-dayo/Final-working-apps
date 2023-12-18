import zeroed_list

def test_to_see_if_it_puts_zero_in_first_and_last_index() :
	numbers = [2, 5, 7, 8, 9]
	assert zeroed_list.zeroed_code(numbers) == [0, 5, 7, 8, 0]
import zeroed_list

def test_to_see_if_it_puts_zero_in_first_and_last_index() :
	assert zeroed_list.zeroed_code([2, 5, 7, 8, 9]) == [0, 5, 7, 8, 0]
import discount_calculator

def test_to_see_if_it_calculates_discount_price() :
	assert discount_calculator.my_discount(150, 15) == 127.5
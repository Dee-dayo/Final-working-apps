import duplicate_checker

def test_to_see_if_it_gets_duplicates() :
	fruit = ['apple', 'orange', 'banana', 'apple']
	names = ['Yoda' 'Moses', 'Joshua', 'Mark']
	assert duplicate_checker.check_duplicates(fruit) == ['apple']
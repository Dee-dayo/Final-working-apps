def my_discount(price, discount) :
	discount_percentage = discount / 100
	discount_percentage = price * discount_percentage
	discount_price = price - discount_percentage

	return discount_price

print(my_discount(150, 15))
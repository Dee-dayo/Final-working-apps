def main_app():
	name = input("Enter employee's name: ")
	no_of_hours = float(input('Enter number of hours worked in a week: '))
	hourly_pay_rate = float(input('Enter hourly pay rate: '))
	month = input('Enter the month name: ')
	federal_tax_rate = float(input('Enter federal tax withholding rate: '))
	state_tax_rate = float(input('Enter state tax withholding rate: '))
	total = no_of_hours * hourly_pay_rate

	print('\n\n')
	print(display_header(name, month))
	print(name_of_customer(name))
	print(hours(no_of_hours))
	print(pay_rate(hourly_pay_rate))
	print(gross_pay(no_of_hours, hourly_pay_rate))
	print(federal_withholding(no_of_hours, hourly_pay_rate, federal_tax_rate))
	print(state_withholding(no_of_hours, hourly_pay_rate, state_tax_rate))
	print(total_deduction(total, federal_tax_rate, state_tax_rate))

	
def display_header(name, month):
	return f'''________________________________________________________
{name} Payroll statement for the month of {month}
________________________________________________________'''

def name_of_customer(name):
	return f"Employee Name: {name}"

def hours(hours_worked):
	return f'Hours Worked: {hours_worked}'

def pay_rate(pay_rate):
	return f'Pay Rate: ${pay_rate}'

def gross_pay(hours_worked, pay_rate):
	return f'Gross Pay: ${hours_worked * pay_rate}'

def federal_withholding(hours, pay, fed_tax):
	fed_withholding = (hours * pay) * (fed_tax / 100) 
	return f'Federal Withholding ({fed_tax}%): ${fed_withholding}'

def state_withholding(hours, pay, state_tax):
	state_withholding = (hours * pay) * (state_tax / 100)
	return f'State Withholding ({state_tax}%): ${state_withholding}'

def total_deduction(total, fed_tax, state_tax):
	deduction = ((total * fed_tax) / 100) + ((total * state_tax) / 100)
	return f'Total Deduction: ${deduction}'

main_app()

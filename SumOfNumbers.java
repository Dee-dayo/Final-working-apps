public class SumOfNumbers {

	public static int sumOfDigitsUsingForLoop (int [] numbers) {
		int sum = 0;
		for (int index = 0; index <= numbers.length - 1; index ++) {
			sum += numbers[index] ;
		}
	return sum;
	}

	public static int sumOfDigitsUsingWhileLoop (int [] numbers) {
		int sum = 0;
		int count = 0 ;
		while (count <= numbers.length - 1) {
			sum += numbers [count] ;
			count ++ ;
		}
	return sum ;
	}

	public static int sumOfDigitsUsingDoWhileLoop (int [] numbers) {
		int sum = 0;
		int index = 0;
		do {
			sum += numbers [index] ;
			index ++ ;
		} while (index <= numbers.length - 1) ;
	return sum ;
	}

	public static void main (String [] args) {
		int [] myArray = {1, 2, 3, 4, 5} ;
		System.out.print("The sum using For loop is " + sumOfDigitsUsingForLoop(myArray)) ;
		System.out.println() ;
		System.out.print("The sum using While loop is " + sumOfDigitsUsingWhileLoop(myArray)) ;
		System.out.println() ;
		System.out.print("The sum using Do While loop is " + sumOfDigitsUsingDoWhileLoop(myArray)) ;
	}
}
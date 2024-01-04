public class ElementCheck {

	public int intOccurence(int[] numbers, int element) {
		for (int i = 0; i <= numbers.length - 1; i ++) {
			if (element == numbers[i]) {
				System.out.print(element) ;
			} else
			if (element != numbers[i]) {
				System.out.print("Not present") ;
			}
		}
	return element ;
	}

	public double doubleOccurence(double[] numbers, double element) {
		for (int i = 0; i <= numbers.length - 1; i ++) {
			if (element == numbers[i]) {
				System.out.print(element) ;
			} else
			if (element != numbers[i]) {
				System.out.print("Not present") ;
			}
		}
	return element ;
	}

	public String stringOccurence(String[] lists, String element) {
		for (int i = 0; i <= lists.length - 1; i ++) {
			if (element == lists[i]) {
				System.out.print(element) ;
			} else
			if (element != lists[i]) {
				System.out.print("Not present") ;
			}
		}
	return element ;
	}

	public static void main (String [] args) {

		ElementCheck nowJare = new ElementCheck () ;
		int[] numbers = {12, 39, 48, 10, 49, 29} ;
		int isPresent = 12 ;
		nowJare.intOccurence(numbers, isPresent);
	}
}
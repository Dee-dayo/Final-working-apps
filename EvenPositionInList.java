public class EvenPositionInList {

	public void evenElementPositionInt(int[] numbers) {
		for (int i = 1; i <= numbers.length-1; i += 2) {
			System.out.print(numbers[i] + " ") ;
		}
	}

	public void evenElementPositionDouble(double[] numbers) {
		for (int i = 1; i <= numbers.length-1; i += 2) {
			System.out.print(numbers[i] + " ") ;
		}
	}

	public void evenElementPositionString(String[] numbers) {
		for (int i = 1; i <= numbers.length-1; i += 2) {
			System.out.print(numbers[i] + " ") ;
		}
	}

	public static void main (String[] args) {
		EvenPositionInList newList = new EvenPositionInList () ;
		int[] myArray = {34, 27, 48, 20, 38, 58, 40, 50, 10, 38};
		newList.evenElementPositionInt(myArray) ;
		
		System.out.println() ;
		double[] anotherArray = {84.02, 42.30, 48.102, 48.94, 281.93};
		newList.evenElementPositionDouble(anotherArray) ;
		
		System.out.println() ;
		String[] listOfItems = {"dog", "basket", "charcoal", "book", "pad", "game"};
		newList.evenElementPositionString(listOfItems) ;
	}
}
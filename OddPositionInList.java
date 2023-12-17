public class OddPositionInList {

	public void oddElementPositionInt(int[] numbers) {
		for (int i = 0; i <= numbers.length -1; i += 2) {
			System.out.print(numbers[i] + " ") ;
		}
	}

	public void oddElementPositionDouble(double[] numbers) {
		for (int i = 0; i <= numbers.length -1; i += 2) {
			System.out.print(numbers[i] + " ") ;
		}
	}

	public void oddElementPositionString(String[] numbers) {
		for (int i = 0; i <= numbers.length -1; i += 2) {
			System.out.print(numbers[i] + " ") ;
		}
	}

	public static void main (String[] args) {
		OddPositionInList newList = new OddPositionInList () ;
		int[] myArray = {34, 27, 48, 20, 38, 58, 40, 50, 10, 38};
		newList.oddElementPositionInt(myArray) ;
		
		System.out.println() ;
		double[] anotherArray = {84.02, 42.30, 48.102, 48.94, 281.93};
		newList.oddElementPositionDouble(anotherArray) ;
		
		System.out.println() ;
		String[] listOfItems = {"dog", "basket", "charcoal", "book", "pad", "game"};
		newList.oddElementPositionString(listOfItems) ;
	}
}
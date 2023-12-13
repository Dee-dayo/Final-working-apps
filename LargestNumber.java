public class LargestNumber {
	public int largestIntElement (int[] numbers) {
		int largest = numbers[0];
		for (int i = 0; i <= numbers.length - 1; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i] ;
			}
		}
	return largest;
	}

	public double largestDoubleElement (double[] numbers) {
		double largest = numbers[0];
		for (int i = 0 ; i <= numbers.length - 1; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i] ;
			}
		}
		
	return largest ;
	}
}
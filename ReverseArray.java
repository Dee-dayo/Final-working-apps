public class ReverseArray {
	
	public int[] reverseList(int[] myArray) {
		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.print(myArray[i] + " ") ;
		}
	return myArray ;
	}

	public double[] reverseListDouble(double[] myArray) {
		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.print(myArray[i] + " ") ;
		}
	return myArray ;
	}

	public static void main (String[] args) {
		ReverseArray dyPlay = new ReverseArray () ;
		int[] now = {840, 482, 8, 57, 24, 68, 20, 382, 584} ;
		int[] empty = dyPlay.reverseList(now) ;
	}
} 
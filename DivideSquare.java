public class DivideSquare {
	
	public double divideOrSquare(int number) {
		if (number % 5 == 0) {
			return Math.sqrt (number) ;
		}
		else  {
			return number % 5 ;
		}
	}
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

	@Test
	public void testIfThisCanGetHighestInt() {
		LargestNumber newArray = new LargestNumber()  ;
		int[] letsCheck = {463, 582, 508, 392, 472, 382} ;
		int result = newArray.largestIntElement(letsCheck) ;
		assertEquals (582, result) ;
	
		int[] checkAgain = {-472, 483, 842, 583, -48, 83} ;
		int result2 = newArray.largestIntElement(checkAgain) ;
		assertEquals (842, result2) ;

		int[] checkOh = {-39, -482, -483, -5833, -580, -5834} ;
		int result3 = newArray.largestIntElement(checkOh) ;
		assertEquals (-39, result3) ;
	}

	@Test
	public void testIfThisCanGetHighestDouble() {
		LargestNumber anotherArray = new LargestNumber() ;
		double[] letsGo = {34.2, 58.3, 58.1, 69.23, 59.74} ;
		double result = anotherArray.largestDoubleElement(letsGo) ;
		assertEquals (69.23, result) ;
	}
}
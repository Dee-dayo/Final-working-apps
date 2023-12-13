import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseArrayTest {

	@Test
	public void testIfListIsReversingInt() {
		ReverseArray newRev = new ReverseArray() ;
		int[] myArray = {12, 34, 29, 39, 10, 48, 210} ;
		int[] emptyArray =newRev.reverseList(myArray) ;
		assertEquals (emptyArray, myArray) ;
	}

	@Test
	public void testIfListIsReversingDouble() {
		ReverseArray newRev = new ReverseArray() ;
		double[] myArray = {12.5, 489.03, 482.48, 739.17, 482.48} ;
		double[] emptyArray = newRev.reverseListDouble(myArray) ;
		assertEquals (emptyArray, myArray) ;
	}
}
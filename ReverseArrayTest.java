import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseArrayTest {

	@Test
	public void testIfListIsReversingInt() {
		ReverseArray newRev = new ReverseArray() ;
		int[] myArray = {12, 34, 29, 39, 10, 48, 210} ;
		int[] expected = {210, 48, 10, 39, 29, 34, 12}; 
		int[] emptyArray =newRev.reverseList(myArray) ;
		assertEquals (expected, emptyArray) ;
	}

}
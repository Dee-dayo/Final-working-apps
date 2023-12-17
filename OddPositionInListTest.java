import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals ;

public class OddPositionInListTest {

	@Test
	public void testIfThisCanPrintOddPositionInt() {
		//given
		OddPositionInList oddArray = new OddPositionInList () ;
		int[] newArray = {23, 19, 39, 59, 20, 48} ;
		int[] resultArray = {23, 39, 20} ;
		//when
		int anotherArray = oddArray.oddElementPosition(newArray) ;
		//assert
		assertEquals (resultArray, anotherArray) ;
	}
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideSquareTest {

	@Test
	public void testThatThisCanDivideOrSquareAnInteger () {
		DivideSquare divideSquare = new DivideSquare () ;
		double answer = divideSquare.divideOrSquare(25) ;
		double expected = 5;
		assertEquals (expected, answer) ;

	}
}
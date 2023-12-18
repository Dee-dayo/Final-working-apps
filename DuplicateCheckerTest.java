import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateCheckerTest {

	@Test
	public void testIfThisAppChecksForDuplicate () {
		DuplicateChecker duplicateCheck = new DuplicateChecker () ;
		String [] list = {"dog", "pencil", "chalk", "dog", "tile"} ;
		String expected = "dog";
		assertEquals (expected, duplicateCheck.checkDuplicate(list)) ;


	}
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals ;
import static org.junit.jupiter.api.Assertions.assertNotEquals ;

public class ElementCheckTest {
	
	@Test
	public void testIfThisCanCheckIntElementInList () {
		ElementCheck newCheck = new ElementCheck () ;
		int[] newArr = {23, 48, 29, 48, 50, 12} ;
		int result = newCheck.intOccurence (newArr,  50) ;
		assertEquals (50, result) ;

		int[] anotherArray = {382, 492, 480, 582} ;
		int answer = newCheck.intOccurence (anotherArray, 382) ;
		assertEquals (382, answer) ;
	}

	@Test
	public void testIfIntElementIsNotInTheList () {
		ElementCheck newCheck = new ElementCheck () ;
		int[] newArr = {374, 582, 592, 588, 572} ;
		int result = newCheck.intOccurence (newArr, 50) ;
		assertNotEquals ("Not present", result);
	}

	@Test
	public void testIfThisCanCheckDoubleElementInList () {
		ElementCheck newCheck = new ElementCheck () ;
		double[] newArr = {93.74, 482.39, 41.38, 32.84, 20.32} ;
		double result = newCheck.doubleOccurence (newArr,  93.74) ;
		assertEquals (93.74, result) ;
	}

	@Test
	public void testIfDoubleElementIsNotInTheList () {
		ElementCheck newCheck = new ElementCheck () ;
		double[] newArr = {374.53, 582.42, 592.67, 588.23, 572.96} ;
		double result = newCheck.doubleOccurence (newArr, 50) ;
		assertNotEquals ("Not present", result);
	}

	@Test
	public void testIfStringElementIsInsideTheList () {
		ElementCheck newCheck = new ElementCheck () ;
		String[] newArr = {"bag", "dog", "pepper", "toad", "play"} ;
		String result = newCheck.stringOccurence( newArr, "dog") ;
		assertEquals ("dog", result) ;
	}

	@Test
	public void testIfStringElementIsNotInTheList () {
		ElementCheck newCheck = new ElementCheck () ;
		String[] newArr = {"bag", "dog", "pepper", "toad", "play"} ;
		String result = newCheck.stringOccurence( newArr, "paul") ;
		assertNotEquals ("Not present", result) ;
	}
}
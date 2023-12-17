import java.util.Arrays ;

public class CombineTwoListAlternatively {

	public static Object[] combineTwoArray(String[] firstArray, Object[] secondArray) {
		Object[] newArray = new Object [firstArray.length + secondArray.length] ;
		
		int count = 0 ;
		int count2 = 1 ;
		for (int index = 0; index <= firstArray.length - 1; index ++) {
			newArray[count]  = firstArray[index] ;
			count += 2 ;
		}
		
		for (int index = 0; index <= secondArray.length - 1; index ++) {
			newArray[count2] = secondArray[index] ;
			count2 += 2 ;
		}
	return newArray;
	}

	public static void main (String[] args) {
		String[] myArray = {"a", "b", "c"} ;
		Object[] myArray2 = {1, 2, 3} ;

		System.out.print(Arrays.toString(combineTwoArray(myArray, myArray2))) ;

	}
}
import java.util.Arrays; 

public class ConcatenateLists {

	public static Object[] joinTwoLists (Object [] firstArray, Object [] secondArray) {
		int length = firstArray.length + secondArray.length ;
		Object [] newArray = new Object[length] ;
		int count = 0;

		for (int index = 0; index <= firstArray.length - 1; index ++) {
			newArray[count] = firstArray[index] ;
			count ++ ;
		}
		for (int index = 0; index <= secondArray.length - 1; index ++) {
			newArray[count] = secondArray[index] ;
			count ++ ;
		}
	return newArray;
	}

	public static void main (String[] args) {
		String [] firstArray = {"a", "b", "c", "dayo", "dog"} ;
		Object [] secondArray = {1, 2, 3, 6, 2, 6, 48} ;

		System.out.print(Arrays.toString(joinTwoLists(firstArray, secondArray))) ;

	}

}
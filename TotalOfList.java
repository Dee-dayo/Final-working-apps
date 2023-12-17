public class TotalOfList {

	public int sumList(int[] myList) {
		int sum = 0;
		for (int index = 0 ; index <= myList.length - 1; index ++) {
			sum += myList[index] ;

		}
	return sum ;
	}

	public static void main (String[] args) {

	TotalOfList newList = new TotalOfList () ;

	int[] myArray = {1, 2, 3, 4, 5} ;

	System.out.print(newList.sumList(myArray)) ;

	}


}
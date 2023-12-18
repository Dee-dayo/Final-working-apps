public class DuplicateChecker {
	public static String[] checkDuplicate(String [] lists) {
	
		String[] itemsSeen = new String[lists.length] ;
		String[] alreadyInList = new String[lists.length] ;
		
		for (int index = 0; index <= lists.length - 1; index ++) {
			if (lists[index] == itemsSeen) {
				itemsSeen = lists[index] ;
			} 
			else {
				alreadyInList = lists[index] ;
			}
		}
		if (alreadyInList > 0) {
			return alreadyInList ;
		}
		else {
			return System.out.print("No Duplicates") ;
		}
		
	}

	public static void main (String [] args) {
		String [] list = {"dog", "pencil", "chalk", "dog", "tile"} ;
		checkDuplicate(list) ;

	}
}
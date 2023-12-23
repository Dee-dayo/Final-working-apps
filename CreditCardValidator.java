import java.util. Scanner;
import java.util.Arrays ;

public class CreditCardValidator {

	private static Scanner input = new Scanner(System.in) ;
	private static int[] cardDetail ;
	
	public static void mainApp() {
		System.out.println("Hello, Kindly Enter Card details to verify") ;
		String cardNo = input.nextLine() ;

		if (cardNo.length() >= 13 && cardNo.length() <= 16) {
			cardDetail = new int [cardNo.length()];
			
			for (int index = 0; index <= cardNo.length() - 1; index ++) {
				cardDetail[index] = Character.getNumericValue(cardNo.charAt(index));
			}
		} else {
		System.out.println("Please enter a valid card number") ;	
		mainApp() ;
		}

	System.out.println("\n\n**************************************");
	cardType() ;
	System.out.println();
	cardNo() ;
	System.out.println();
	cardLength() ;
	System.out.println();
	cardValidity() ;
	System.out.println("\n**************************************");
	}

	public static void cardType() {
		switch (cardDetail[0]) {
			case 5 -> System.out.print("**Credit Card Type: Master Card");
			case 4 -> System.out.print("**Credit Card Type: Visa Card") ;
			case 6 -> System.out.print("**Credit Card Type: Discover Card") ;
			case 3 -> System.out.print("**Credit Card Type: American Express Card") ;
			default -> System.out.print("**Credit Card Type: Invalid card") ;
		}
	}

	public static void cardNo () {
		System.out.print("**Credit Card Number: ");
		for (int index=0; index <= cardDetail.length - 1; index ++) {
			System.out.print(cardDetail[index]) ;
			}
	}

	public static void cardLength() {
		int noOfDigits = cardDetail.length;
		System.out.printf("**Credit Card Digit Length: %d", noOfDigits);
	}

	public static void cardValidity() {
		int[] doubleResult = new int[(int)cardDetail.length / 2] ;
		int counter = 0 ;
		int addAllEven = 0;
		int addAllOdd = 0;
		for (int index = cardDetail.length - 2; index >= 0; index -= 2) {
				if ((cardDetail[index] * 2) >= 10) {
					int num1 = (cardDetail[index] * 2) / 10;
					int num2 = (cardDetail[index] * 2) % 10 ;
					int answer = num1 + num2 ;	
					doubleResult[counter] = answer;
				} else {
				doubleResult[counter] = cardDetail[index] * 2;
				}
			addAllEven += doubleResult[counter] ;
			counter ++ ;
		}

		for (int index = cardDetail.length -1; index >= 0; index -= 2) {
			addAllOdd += cardDetail[index] ;
		}
		int result = addAllEven + addAllOdd ;
		
		if (result % 10 == 0) {
			System.out.print("**Credit Card Validity Status: Valid");
		} else {
			System.out.print("**Credit Card Validity Status: Invalid") ;
		}
	}

	public static void main (String[] args) {

		mainApp() ;
	}
}
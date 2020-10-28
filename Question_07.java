package assignment_8;

public class Question_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(isPalindrome(1021));
	}
	
	public static boolean isPalindrome(int number) {	
		int reverseNumber = 0;
		int newDigit;
		int comprareDigit = number;		
		while (number > 0) {	
			newDigit = number % 10;		
			reverseNumber = (reverseNumber * 10) + newDigit;	
			number = number / 10;		}
		if (reverseNumber == comprareDigit) {
			return true;
		} else {
			return false;
		}	}

}

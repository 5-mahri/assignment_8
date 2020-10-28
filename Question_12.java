package assignment_8;

public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(hamletQuote(true, true));
		System.out.println(hamletQuote(true, false));
		System.out.println(hamletQuote(false, true));
		System.out.println(hamletQuote(false, false));

	}
	
	public static boolean hamletQuote(boolean t, boolean f) {
		if (t || f) {
			return true;
		}else {
			return false;
		}
		
	}

}

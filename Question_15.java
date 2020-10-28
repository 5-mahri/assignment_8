package assignment_8;

import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		boolean b=scan.nextBoolean();
		int t=scan.nextInt();
		int c=scan.nextInt();
		System.out.println(validateTask(b,t,c));
		
	}
	public static boolean validateTask(boolean b, int taskID, int currentID) {
		
		if((b == true && (taskID-1) == currentID)) {
			return b=true;
			  
		}else {
		return b=false;
		}
	}
}

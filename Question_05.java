package assignment_8;
import java.util.Scanner;
public class Question_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 
		 System.out.println("enter number:");
		 int num=scan.nextInt();
		sign(num);

	}
	
	public static void sign(int a) {
		 
		  
		  if(a>0) {
			  System.out.println("1");
		  }else if(a<0) {
			  System.out.println("-1");
		  }else {
			  System.out.println("0");
		  }
		
	}

}

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {

		int value1 = 0, value2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first value");
		
		try{
			
		value1 = scanner.nextInt();
		
		System.out.println("Enter second value");
		value2 = scanner.nextInt();		
		
		}
		
		catch(InputMismatchException e){
			System.out.println("Enter number only");
			e.printStackTrace();
		}
		
		System.out.println("Result is=" + (value1 + value2));
		
	}

}

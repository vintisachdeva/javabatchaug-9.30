import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandlingDemo3 {

	public static void main(String[] args) {
		
		int value1 = 0, value2 = 0;
		Scanner scanner = new Scanner(System.in);
				
		try{
	
		
		System.out.println("Enter your first value");
		value1 = scanner.nextInt();
		
		System.out.println("Enter your second value");
		value2 = scanner.nextInt();
		}
		catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("Only numbers are allowed");
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("You cannot divide by zero");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Any other exception occured");
		}
		//what is the difference between final and finally?
		finally{
			System.out.println("Result is=" + (value1/value2));
			System.out.println("Always executed");
			scanner.close();
		}
	}

}

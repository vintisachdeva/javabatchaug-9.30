import java.util.InputMismatchException;
import java.util.Scanner;


public class ThrowsDemo1 {

	int value1, value2, result;
	
	void input() throws InputMismatchException{
		
		//try{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first value");
		value1 = scanner.nextInt();
		
		System.out.println("Enter second value");
		value2 = scanner.nextInt();
		//}
		/*catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("Only no's allowed");
			
		}*/
	}
	
	void calculate() throws InputMismatchException{
		/*try{
			input();	
		}catch(InputMismatchException e){
			System.out.println("Exception Handled");
			e.printStackTrace();
		}*/
		input();
		result = value1 + value2;
	}
	
	void display() throws InputMismatchException{
		calculate();
		System.out.println("Result is="+ result);
	}
	
	public static void main(String[] args) throws InputMismatchException{
		
		ThrowsDemo1 obj = new ThrowsDemo1();
		
		obj.display();
		
		//obj.input();
		//obj.calculate();
		/*try{
		obj.display();
		}catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("Handled");
		}*/
	}

}

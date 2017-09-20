
public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		
		int value1 = 0, value2  = 0;
		
		try{
		
		value1 = Integer.parseInt(args[0]);
		value2 = Integer.parseInt(args[1]);
		}
		catch(NumberFormatException e){
			System.out.println("Enter only number between [0-9]");
			e.printStackTrace();
		}
		
		catch(Exception e){
			System.out.println("Any other exception occured");
			e.printStackTrace();
		}
		
		
		System.out.println(value1 + value2);
		
	}

}

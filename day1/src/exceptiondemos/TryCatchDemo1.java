package exceptiondemos;

public class TryCatchDemo1 {
	public static void main(String[] args) {
		
		
		try {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		int c=a/b;
		
		} catch (ArithmeticException e) {
			System.out.println("hey ..args.i catch you .. " + e);
		}catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("hey ..no value found .. " + e2);
			
		}
		catch (Exception e) {
			System.out.println("inside main");
		}
	
		finally {
			System.out.println("inside finally");
		}
		
	}

}

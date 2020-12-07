package exceptiondemos;

public class ThrowsDemo {
	
	
	
	public static void demoProc() {
		
		try {
		
	 throw new NullPointerException("its being thrown");
	 
		} catch (NullPointerException e2) {
			
		}
		
	}
	
	public static void main(String[] args) {
		demoProc();
	}

}

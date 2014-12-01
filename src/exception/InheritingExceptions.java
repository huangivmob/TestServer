package exception;

public class InheritingExceptions {

	public void f() throws SimpleException{
		System.out.println("throws simpleException from f()");
		throw new SimpleException();
	}
	
	public void g() throws SimpleException{
		System.out.println("throws simpleException from g()");
		throw new SimpleException("g exception:");
	}
	
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			System.out.println("handle it..");
		}
		
		try {
			sed.g();
		} catch (SimpleException e) {
			e.printStackTrace();
		}
	}
}

package pakage2;

import pakage1.Parent;

public class Child extends Parent{

	public static void main(String[] args) {
		new Child().test();
	}
	
	private void test(){
		System.out.println(x);
	}
}

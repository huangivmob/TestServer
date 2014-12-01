package exception;

public class Class_2 {
	public void method_2() {
        Class_1 c1 = new Class_1();
        try {
			c1.method_1();
		} catch (ClassNotFoundException e) {
            //System.out.println("我不处理，我再抛！");
			//throw e;
			//System.out.println("我c2来处理，你别管了!");
		}
	}
}

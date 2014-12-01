package innerclass;

import innerclass.Outer.Inner;

public class Other {
	public static void main(String[] args) {
        Inner i = new Outer().new Inner();
	}
}

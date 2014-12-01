package innerclass;

public class Outer {

	class Inner {
		Outer getOuter(){
			return Outer.this;
		}
	}

	Inner getInner() {
		return new Inner();
	}

	
	public static void main(String[] args) {
		Inner i1 = new Outer().getInner();
		Inner i2 = new Outer().new Inner();
		Outer.Inner i3 = new Outer().getInner();
		Outer outer = i1.getOuter();
	}
}

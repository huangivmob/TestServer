import java.util.HashSet;
import java.util.Set;

public class Test{
	public static void main(String[] args) {
		String $asdas = "asdas";
		// String a = new String("a");
		// String b = new String("a");
		// System.out.println(a.equals(b));
		// System.out.println(a == b);
		//
		// Person1 p1 = new Person1();
		// p1.name = "zhangsan";
		// Person1 p2 = new Person1();
		// p2.name = "zhangsan";
		// System.out.println(p1.equals(p2));
		// System.out.println(p1 == p2);
//		new Test().bubbleSort();
//		for (int i = 0; i < 10; i++) {
//			if (i == 5)
//			continue;
//
//			System.out.println("I = "+i);
//		}
//	String s1 ="c";
//	String s2 ="A";
//	System.out.println(s1.equals(s2)+"/"+s1.equalsIgnoreCase(s2));
//	StringBuffer sb = new StringBuffer("abcdefg");
//	sb.insert(4, "/");
//	System.out.println(sb);
//	String s3 = "a";
//	String s4 = s3;
//	System.out.println(s1.hashCode());
//	System.out.println(s4.hashCode());
	
//	Person1 p1 = new Person1();
//	p1.name = "a";
//	Person1 p2 = new Person1();
//	p2.name = "a";
//	//p2 = p1;
//	System.out.println(p1.equals(p2)+"/"+(p1==p2));
//
  //   int [] a =  {1,2};
//     int [] b =  a;
//     System.out.println(a==b);
		int i = 1;
		int sum = 0;
//		while (i <= 100) {
//			if (i % 2 == 0) {
//				sum = sum + i;
//			}
//			i++;
//		}
//		System.out.println(sum);

		for (int x =0; x<=100;x+=2){ sum=sum+x;}

		System.out.println(sum);
	}
	public static int fun(int c)
	{
			return  c+=2;
		}

	private void bubbleSort() {
		int[] array = { 7, 1, 2, 4, 3, 5, 6 };

		int temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length - 1; j++) {
				if (array[j + 1] < array[j]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public Test(){
	}
}

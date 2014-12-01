/*
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 
 */
public class Practice1 {
	public static void main(String[] args) {
		char i = 2;
		new Practice1().practiceSwitch(i);

		int x, y, z;
		x = 5;
		y = 10;
		z = 15;
		System.out.println(x > 5 && y < 10 | z >= 15);

		 do 
			while(y<10)System.out.println();
		 while (x>15);
		int age = 13;
		outer: while (age < 21) {

			age++;
			while (age == 16) {
				System.out.println("allowd drive!");
				continue outer;
			}
			System.out.println("another year!");
		}
	}

	private void practiceSwitch(char var) {
		switch (var) {

		case 1:
			System.out.println("char value is:" + var);
			break;
		case 2:
			System.out.println("char value is:" + var);
			break;
		default:
			System.out.println("this is default char value!");
		}
	}

}

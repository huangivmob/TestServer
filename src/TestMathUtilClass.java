public class TestMathUtilClass {
	public static void main(String[] args) {
		double num_1 = 10.5;
		double num_2 = -10.5;
		double PI = Math.PI;
		double num_3 = 0;
		double[] doubleArray = {num_1,num_2,num_3,PI};
		// 求绝对值
		for (double d : doubleArray) {
			System.out.println(d+"的绝对值为:"+Math.abs(d));
			System.out.println(d+"的最高限值为:"+Math.ceil(d));
			System.out.println(d+"的最低限值为:"+Math.floor(d));
		}
		
		double temp =5;
		long finalValue;
		for (int i = 0; i < 10; i++) {
			temp = Math.random()*100;
			System.out.println("第"+i+"个随机数为:"+temp);
			finalValue = Math.round(temp);
			System.out.println("四舍五入后的值为:"+finalValue);		
		}
		Float f1 = new Float("2.4");
		Float f2 = new Float(2.4);
		System.out.println((f1==f2)+"/"+f1.equals(f2));
		
		
		
	}
}

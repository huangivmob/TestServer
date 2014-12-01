package design_patterns.strategy;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Integer.toBinaryString(0);
		System.out.println("********************************倒立直角三角形********************************");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out
				.println("********************************正立直角三角形********************************");
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out
				.println("********************************倒立数列********************************");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		// 九九乘法表
		System.out
				.println("********************************九九乘法表********************************");
		System.out.print("\t");
		// 首先打印出一行的1至9
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "\t");
		}
		// 换行
		System.out.println();
		// 制表
		for (int i = 9; i > 0; i--) {
			System.out.print(i + "\t");
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		// 倒立等边三角形
		System.out
				.println("********************************倒立等边三角形********************************");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// 正立等边三角形
		System.out
				.println("********************************正立等边三角形********************************");
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		drawRectangle(3, 6);
		selectMax();
		int[] arr = { 1, 3, 5, 7, 9 };
		int index = half_search(arr, 10);
		System.out.println("index:" + index);

	}

	public static void drawRectangle(int row, int column) {
		System.out
				.println("********************************根据传入的行数，列数绘制矩形********************************");
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == 1 || i == row) {
					System.out.print("* ");
				} else {
					if (j == 1 || j == column) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void selectMax() {
		int[] nums = { 3, 7, 12, 10, 1, 5 };
		int max;
		max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("max is :" + max);
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int half_search(int[] array, int target) {
		int min = 0;
		int max = array.length - 1;
		int mid = (min + max)/2;
		while (target != array[mid]) {
			if (target > array[mid]) {
				min = mid + 1;
			} else if (target < array[mid]) {
				max = mid - 1;
			}

			if (min > max)
				return min;

			mid = (min + max)/2;
		}
		return mid;
	}
}

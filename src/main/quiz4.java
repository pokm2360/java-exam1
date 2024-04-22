package main;

public class quiz4 {

	public static void main(String[] args) {

	함수();
	함수2();
	}


	public static void 함수() {
		int[] arr = {2, 4, 6, 8, 10};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("첫번째 배열의 합계: " + sum);
	}
	
	public static void 함수2() {
		int[] arr2 = {2, 4};
		
		if (arr2.length < 3) {
			System.out.println("두번째 배열의 합계: " + -999);
		}

	}
}
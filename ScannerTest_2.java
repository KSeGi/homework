package test0417;

import java.util.Scanner;

public class ScannerTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[] {1,2,3,4,5};
		int i;
		
		System.out.println("초기화 된 값 출력");
		for(i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]+"\t");
		}
		
		System.out.println();
		for(i=0;i<intArr.length;i++) {
			intArr[i]=sc.nextInt();
		}
		
		System.out.println("배열에 저장된 값 출력");
		for(i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]+"\t");
		}
	
	}
	

}

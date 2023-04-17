package test0417;

import java.util.Scanner;

public class ScannerTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("5개의 숫자 입력해라");
		for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
			

	}

}

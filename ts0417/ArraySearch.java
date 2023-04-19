package ts0417;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			if(arr[i]==search) {
				break;
			}
		}
	}

}

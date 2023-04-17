package ts0417;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자 10개를 쓰시오");
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[10];
		int num=arr[0];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(num<arr[i]) {
				num=arr[i];
			}
		}
		System.out.println(num);
	}

}

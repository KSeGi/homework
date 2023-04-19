package ts0417;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("5명의 수학점수를 입력하시오");
		int[] arr= new int[5];
		int sum=0,avg;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum=arr[i]+sum;
		}
		avg=sum/arr.length;
		System.out.println("합계는 "+sum+" 평균은 "+avg);
	}

}

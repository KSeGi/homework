package test405;

import java.util.Scanner;

public class T8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값을 입력하세요");
		num = sc.nextInt();
		int result = (num>0)?num:-num;	
		System.out.println("절대값은 "+result+"입니다.");
		
		String boo=(result%2==0)?"짝수":"홀수";
		System.out.println("입력함 값은 "+boo+"입니다.");
			
		

		
	}

}

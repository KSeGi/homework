package test405;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		jumsu = sc.nextInt();
		
		if(jumsu>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		
		int py=60;
		int java = 70;
		int and = 80;
		int cl=50;
		int cc=30;
		int sum = py+java+and+cl+cc;
		float avg = sum/5;
		System.out.println("나잘난의 성청 총합계는 "+sum+"입니다. 평균은 "+avg+"입니다.");
		
		
		
		
		
		
	}

}

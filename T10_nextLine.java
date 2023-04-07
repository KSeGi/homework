package test405;

import java.util.Scanner;

public class T10_nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade;
		Scanner sc= new Scanner(System.in);

		System.out.println("학년을 입력하세요");
		
		grade = sc.nextLine();
		
		switch(grade) {
		case "1" :
			System.out.println("1학년 입니다.");
		break;
		case "2" :
			System.out.println("2학년 입니다.");
		break;
		case "3" :
			System.out.println("3학년 입니다.");
		break;
		case "4" :
			System.out.println("4학년 입니다.");
		break;
		default:
			System.out.println("학년을 잘못입력하셨습니다.");
		break;
			
		}
	}

}

package day05;

import java.util.Scanner;

public class D7_nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주민번호를 입력하세요");
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine(); 
		
		char gender = str.charAt(7);
		//받은 값 중 7번째 index의 char값 하나만 추출해서 char타입의 변수에 담아준다.
		System.out.println(gender);
		
		if(gender=='1'||gender=='3'){
			System.out.println("남자");	
		}
		else if(gender=='2'||gender=='4') {
			System.out.println("여자");
		}
		else
			System.out.println("잘못입력하셨습니다.");
		
		
	}

}

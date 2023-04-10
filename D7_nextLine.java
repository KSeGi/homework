package day05;

import java.util.Scanner;

public class D7_nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주민번호를 입력하세요 ex)123456-1234567");
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
		
		
		String seoul = str.substring(8, 10);
		int sido = Integer.parseInt(seoul);
		//8,9번째 값을 읽어서 00~08이면 "서울에서 태어남"
		
		if(0<=sido&&sido<=8) {
			System.out.println("서울 출생");
		}
		else if(9<=sido&&sido<=12) {
			System.out.println("부산 출생");
		}
		else if(13<=sido&&sido<=15) {
			System.out.println("인천 출생");
		}
		else if(16<=sido&&sido<=25) {
			System.out.println("경기도 출생");
		}
		else if(26<=sido&&sido<=34) {
			System.out.println("강원도 출생");
		}
		else if(35<=sido&&sido<=39) {
			System.out.println("충청북도 출생");
		}
		else if(40<=sido&&sido<=41) {
			System.out.println("대전광역시 출생");
		}
		else if(42<=sido&&sido<=43||45<=sido&&sido<=47) {
			System.out.println("충청남도 출생");
		}
		else if(44==sido||sido==96) {
			System.out.println("세종시 출생");
		}
		else if(48<=sido&&sido<=54) {
			System.out.println("전라북도 출생");
		}
		else if(57<=sido&&sido<=66) {
			System.out.println("전라남도 출생");
		}
		else if(55==sido||sido==56) {
			System.out.println("광주시 출생");
		}
		else if(67<=sido&&sido<=69||sido==76) {
			System.out.println("대구시 출생");
		}
		else if(70<=sido&&sido<=75||77<=sido&&sido<=81) {
			System.out.println("경상북도 출생");
		}
		else if(82<=sido&&sido<=84||86<=sido&&sido<=92) {
			System.out.println("경상남도 출생");
		}
		else if(85==sido||sido==90) {
			System.out.println("울산시 출생");
		}
		else if(93<=sido&&sido<=95) {
			System.out.println("제주도 출생");
		}
				
	}

}

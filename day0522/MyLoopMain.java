package day0522;

import java.util.Scanner;

public class MyLoopMain {
	public static void main(String[] args) {
		MyLoop myLoop = new MyLoop();
		myLoop.play();
	}

}
class MyLoop{
	boolean isExit;
	
	void play() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++프로그램의 반복 루틴++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		while(isExit==false) {
			System.out.println("1.입력 2.출력 3. 종료");
			menu = sc.nextInt();
			switch(menu) {
				case 1 : 
					input();
					break;
				case 2 : 
					output();
					break;
				case 3 : 
					isExit=true;
					System.out.println("종료되었습니다.");
					break;
				default:
					break;
			} 
				
		}
	}
	void input() {
		System.out.println("입력하였습니다.");
	}
	void output() {
		System.out.println("출력하였습니다.");
	}
}
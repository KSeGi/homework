package day0522;

import java.util.Scanner;

public class MyOddEvenGameMain {
	public static void main(String[] args) {
		OddEvenGame game = new OddEvenGame();
		game.play();
	}
}
class OddEvenGame{
	void play() {
		boolean isExit = false;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("==홀,짝 숫자를 입력하세요.==");
		//isExit 변수가 false인 경우 while문을 반복해서 수행한다.
		while(isExit==false) {
			num = (int)(Math.random()*100);
			System.out.println(num);
			System.out.println("1.짝수 2.홀수 3.종료");
			switch(sc.nextInt()) {
			case 1 : 
				odd();
				if(num%2==0) {
					System.out.println("정답!\n");
				}else {
					System.out.println("오답!\n");
				}
				break;
			case 2 : 
				even();
				if(num%2==0) {
					System.out.println("오답!\n");
				}else {
					System.out.println("정답!\n");
				}
				break;
			case 3 : 
				isExit = true;
				System.out.println("\n종료");
				break;
			}
			
		}
	}
	void odd() {
		System.out.println("짝수");
	}
	void even() {
		System.out.println("홀수");
	}
	

}

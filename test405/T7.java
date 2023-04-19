package test405;

import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r;
		int h;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원기둥의 부피를 구하시오.");
		System.out.println("반지름은?");
		r = sc.nextInt();
		System.out.println("높이는?");
		h = sc.nextInt();
		float v = 3.14f*(r*r)*h;
		System.out.println("원기둥의 부피는 "+v+"입니다.");
	}

}

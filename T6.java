package test405;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w;
		int l;
		int h;
		Scanner sr = new Scanner(System.in);
		System.out.println("직사각형의 부피를 구하시오");
		System.out.println("가로는? ");
		w = sr.nextInt();
		System.out.println("세로는? ");
		l = sr.nextInt();
		System.out.println("높이는? ");
		h = sr.nextInt();
				
		float v = w*l*h;
		System.out.println("직사각형의 부피는 "+v+"입니다.");
	}

}

package ts0417;

import java.util.Scanner;

public class ArrayOrderBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,50,39,25,90,11,100,44,38,99};
		int[] b= new int[a.length];
		int num;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
				num=a[j];
				a[j]=a[j+1];
				a[j+1]=num;
				}
			}
		}
		System.out.print("b의 배열은 ");
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<b.length;i++) {
			if(b[i]==100) {
				System.out.println(b[i]+"의 배열 위치는 "+ "b["+i+"]");
			}
		}
		
		String[] c= {"싸이","트와이스","소녀시대","BTS","아이유","브레이브걸스","로제","에이핑크","저스틴비버","비틀즈"};
		Scanner sc = new Scanner(System.in);
		System.out.println("b배열의 숫자를 입력하세요");
		int search = sc.nextInt();
		for(int i=0;i<c.length;i++) {
		 if(b[i]==search) {
			 System.out.println(c[i]);
		 }
		}
		
		
		
	}

}

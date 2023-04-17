package test0417;

public class ArrayTest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'a','p','p','l','e'};
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println("");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}

}

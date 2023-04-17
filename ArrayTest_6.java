package test0417;

public class ArrayTest_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		int key=8;
		
		for(int i=0;i<10;i++) {
			a[i]=i;
		}
		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
			if(key==a[i]) {
				System.out.println("key찾음.");
				break;
			}
			//변수 a에 0~9까지 선언 해 준 후 key값을 찾으면 for문 멈춤.
		}
	}

}

package test0417;

public class ArrayTest_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int[] ten= new int[10];
		ten[0]=1;
		System.out.println(ten[0]);
		for(i=1;i<ten.length;i++) {
			ten[i]=ten[i-1]*10;
			System.out.println(ten[i]);
			
		}
		
		int sum=0;
		for(i=0;i<ten.length;i++) {
			sum+=ten[i];
		}
		System.out.println(sum);
		
		int max;
		if(ten[0]>ten[1]) {
			max=ten[0];
		}
		else {
			max=ten[1];
		}
		System.out.println(max);
		
		int ma=ten[0];
		for(i=0;i<3;i++) {
			if(ma<ten[i]) {
				ma=ten[i];
			}	
		}
		System.out.println(ma);
	
		
	}

}

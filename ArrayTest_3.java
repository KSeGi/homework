package test0417;

public class ArrayTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] bag=null;
		bag = new int[100];
		int bagSum=0;
		for(int i=0;i<bag.length;i++) {
			bag[i]=i+1;
			bagSum+=bag[i];
		}

		System.out.println(bagSum);
		
		
		int[] a = {2,10,8,5,3,9};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}

		System.out.println(sum);
	}

}

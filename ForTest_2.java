package test0417;

public class ForTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		int ten=1;
		for(int i=1;i<num.length;i++) {
			num[i]=10*ten;
			ten=num[i];
			System.out.println("num["+i+"] = "+num[i]+";");	
		}
		
		int[] numb=new int[6];
		for(int i=0;i<numb.length;i++) {
			numb[i]=1;
			System.out.println("numb["+i+"] = "+numb[i]+";");
		}
		
		int[] number = new int[6];
		for(int i=0;i<number.length;i++) {
			number[i]=i+1;
			System.out.println("number["+i+"] = "+number[i]+";");
		}
		
		int[] numbe = new int[6];
		for(int i=0;i<numbe.length;i++) {
			numbe[i]=i*2+1;
			System.out.println("numbe["+i+"] = "+numbe[i]+";");
		}
		
		int[] nu = new int[6];
		for(int i=0;i<nu.length;i++) {
			nu[i]=(i+1)*10;
			System.out.println("nu["+i+"] = "+nu[i]+";");
		}
		
		int[] n= new int[10];
		for(int i=0;i<5;i++) {
			int a= i*2+1;
			n[a]=a*a;
			System.out.println("n["+a+"] = "+n[a]+";");
		}
		
	}

}

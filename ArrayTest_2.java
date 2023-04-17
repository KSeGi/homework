package test0417;

public class ArrayTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] in = new int[5];
		for(i=0;i<in.length;i++) {
			in[i]=1+i;
			System.out.print(in[i]);			
		}
		
		System.out.println("");
		char[] ch = new char[5];
		char cha='A';
		for(i=0;i<ch.length;i++) {
			ch[i]=cha++;
			System.out.print(ch[i]);
		}
		
		System.out.println("");
		boolean[] boo= new boolean[5];
		for(i=0;i<boo.length;i++) {
			if(i%2==0) {
				boo[i]=false;
			}
			else {
				boo[i]=true;
			}
			System.out.print(boo[i]+" ");
		}
		

		System.out.println("");
		short[] sho= new short[5];
		for(i=0;i<sho.length;i++) {
			sho[i]=(short)(100+(i*100));
			System.out.print(sho[i]+" ");
		}
		
		System.out.println("");
		long[] lo=new long[5];
		for(i=0;i<lo.length;i++) {
			lo[i]=90+(45*i);
			System.out.print(lo[i]+" ");
		}
		
		System.out.println("");
		float[] flo=new float[5];
		for(i=0;i<flo.length;i++) {
			flo[i]=3.14f+(3.14f*i);
			System.out.print(flo[i]+"/");
		}
		
		System.out.println("");
		double[] dou= new double[5];
		for(i=0;i<dou.length;i++) {
			dou[i]=3.141592;
			System.out.println(dou[i]+" ");
		}
		
		
	}

}

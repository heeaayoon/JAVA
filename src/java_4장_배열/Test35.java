package java_4장_배열;

public class Test35 {

	public static void main(String[] args) {
		//확장 for문
		int [] arr = {1,2,3,4,5};
		for (int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		double [] dobarr = {1.2,2.6,3.6,4.8,5.9};
		for (double n:dobarr) {
			System.out.print(n+" ");
		}
		System.out.println();
		for (int i =0; i<dobarr.length;i++) {
			if (dobarr[i]>3.3) {
				System.out.print(dobarr[i]+" ");
			}
		}

	}

}

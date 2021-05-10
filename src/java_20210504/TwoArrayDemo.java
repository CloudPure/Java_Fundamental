package java_20210504;

public class TwoArrayDemo {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40};
		// a도 배열이어야함
		int[] b = a;
		 a[3] = 400;
		 System.out.println(b[3]);
	}

}

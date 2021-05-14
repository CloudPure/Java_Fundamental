package java_20210512;

public class StringDemo2 {
	public static void m(int a, int[] b, String s) {
		a = 20;
		b [3] = 40000;
		s += "123";
	}
	public static void main(String[] args) {
		int a = 10;
		int[] b = {1,2,3,4};
		String s = "abc";
		
		System.out.println(a+","+b[3]+","+s);
		m(a,b,s);
		System.out.println(a+","+b[3]+","+s);
	}
}

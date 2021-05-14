package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		
		// equals() → 문자열 비교, equalsIgnoreCase() → 대소문자 구분하지 않고 비교
		// trim() 은 앞뒤 공백을 제거
		/*String m1 = new String("hello ").trim(); 
		String m2 = new String("hello");
		System.out.println(m1.length());
		System.out.println(m2.length());
		if(m1.equalsIgnoreCase(m2)) {
			System.out.println("true");
		}else {
			System.out.println("flase");
		}
		// getBytes() → 문자열을 바이트 배열로 반환하는 메서드
		String m3 = new String("안녕하세요");
		byte[] b = m3.getBytes();
		System.out.println(b.length);  */
		
		String m4 = new String("111111-111118");
		int index = m4.indexOf("-");
		//System.out.println(index);
		
		// . 이후의 문자열 위치를 반환함
		String m5 = new String("a.b.c.zip");
		int lastindexOf = m5.lastIndexOf(".");
		//System.out.println(lastindexOf);
		
		System.out.println(m4.substring(0,m4.indexOf("-"))); // 111111
		System.out.println(m4.substring(m4.indexOf("-")+1));   // 111118

		System.out.println(m4.substring(0,m5.lastIndexOf("."))); // 111111
		System.out.println(m4.substring(m5.lastIndexOf(".")+1));   // 111118
		
		String m6 = new String("010-3024-9999");
		System.out.println(m6.substring(0, m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1, m6.lastIndexOf("-")));
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
		
		int a1 = Integer.parseInt(m4.substring(0,1));
		// 숫자 123을 문자열로 바꾸고 싶어!! 쉬운 방법은 +"" 붙이기 → 근데 이거는 없어보이잖아
		//String m7 = 123 +"";
		//System.out.println(m7);
		
		// valueOf 훨씬 더 메모리 관리를 잘하고 있는 것임
		String m8 = String.valueOf(123);
		System.out.println(m8);
		
		// 글자 바꾸기
		String m9 = m6.replace("-", "_");
		System.out.println(m9);
		
		// 대문자를 소문자로 소문자는 대문자로 바꾸기
		String m10 = new String("hello");
		String m11 = m10.toUpperCase();
		System.out.println(m11);
		String m12 = m11.toLowerCase();
		System.out.println(m12);		
		
		
		
		// 문자열을 특정 기준으로 쪼개서 
		String[] temp = m6.split("-");
		for(String value : temp) {
			System.out.println(value);
		}
		
		// 문자열을 출력하기
		double d = 123456.345;
		String m13 = String.format("%,.2f", d);
		System.out.format("%s\n", m13);
		
		// m13 ==  String.format("%,.2f", d) 같은 의미
		
		// 문자열을 출력하기
		double d1 = 123456.345;
		String m14 = String.format("%,.2f", d);
		System.out.format("%s", String.format("%,.2f", d));
		
		
		
		
		
		
		
		
		
		
		
	}
}

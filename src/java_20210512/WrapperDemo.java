package java_20210512;
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		// ctrl + shift + o → 누르면 import java.util.ArrayList; 이거 뜸 (auto import)
		// 자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에
		// primitive data type을 객체화 할 수 있는 Wrapper Class으로 변환하여 저장해야 했다.
		// 아래와 같이 1를 저장할 수 없음. → list.add(1);
		ArrayList list = new ArrayList();
		// list.add(1); ← 이런 식으로는 에러가 남
		// 1,2,3,4 넣으려면 객체를 넣어야됨!
		list.add(new Integer(1));

		// 1. primitive data type → wrapper class(생성자 이용)
		// Integer i1 = new Integer(10); // 이거 하면 integer에 짝대기가 그어지니까 밑에꺼처럼 작성하기
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("20");
		// ↑ 이렇게 할 줄 알면 됨
		
		// 래퍼런스잖아요! 그니까 클래스인데 클래스는 더할 수 없어요!(연산 불가능)
		//int i3 = i1 + i2;
		
		// wrapper class → primitive data type ( intValuse() ) 그래서 이런 식으로 바꿔줘야 함!
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		
		int i5 = i3 + i4;
		
		// 숫자로 구성된 String → Primitive data type
		// Integer.parseInt("10");
		String s1 = "12345";
		int i6 = Integer.parseInt(s1);
		
		// 4. auto-boxing : primitive data type → wrapper class
		Integer i7 = 100;
		Integer i8 = 200;
		
		// 5. auto-unboxing : wrapper class → primitive data type
		int i9 = i7 + i8;
	}
}

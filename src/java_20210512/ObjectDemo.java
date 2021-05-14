package java_20210512;

class Test{
	String name;
	Test(String name){
		this.name = name;
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Test t1 = new Test("성영한");
		Test t2 = new Test("성영한");
		Test t3 = t2;
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		
		// 뒤에 t1.toSting() 생략 되어있음
		// System.out.println(t1.toSting);
		System.out.println(t1);
	}

}

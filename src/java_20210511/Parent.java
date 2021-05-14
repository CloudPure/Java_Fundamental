package java_20210511;

public class Parent {
	String name;
	String address;
	int age;
	//  alt + shift + s + c → 디폴트 생성자
	
	public Parent() {
		super();
	}
	//  alt + shift + s + o → 매개변수 있는 생성자 만들기
	public Parent(String name, String address, int age) {
		//super();  이거는 여기에 있어야 됨! 위로가면 에러가 남, 근데 이게 없어도 마음 속에 있다고 생각하기
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
}

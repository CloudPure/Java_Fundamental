package java_20210511;

public class Child extends Parent{
	String phone;
	double weight;
	double height;
	
	// alt+shift+s+o 누르기
	// 이 밑에 코드 좋은 코드임!! 
	public Child(String name, String address, int age, String phone, double weight, double height) {
		super(name, address, age);
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	
	
	// 원래는 (String phone, double weight, double height) 이렇게 나와야 되는데 위에처럼 더 자세히 나와줌!
	// 근데 이렇게 나오면 에러가 뜸 그래서 위에처럼 작성해야 됨!!
	public Child(String phone, double weight, double height) {
		
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}

}

package java_20210506;

public class Customer {

	String name;
	String email;
	String phone;
	int age;
	double balance;
	boolean released;
	static double interestRate;
	// 인스턴트는 공용함
	// 클래스 변수(static 변수)는 클래스 이름으로 접근하는 것이 관례
	// 변수로도 접근가능하나 권장하지 않음 ex) c1.interestRate = 6.2;

	static final String bankName = "신한은행";
	// 안 붙이면 유일하지 않음 만약에 넣으면 bank명은 딱 한 개만 만들어져!!
	// 안 쓴다고 에러가 나진 않는데 그래도 쓰면 유일함!!
	// final 변수는 값을 재할당 할 수 없음
	// Customer.BANKNAME ="신한은행";
}
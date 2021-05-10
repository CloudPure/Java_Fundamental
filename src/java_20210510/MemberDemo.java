package java_20210510;


public class MemberDemo {
	public static void print(Member m) {
		// Member m = new Member();
		String name = m.getName();
		String email = m.getEmail();
		String Zipcode = m.getZipcode();
		String getAddr1 = m.getAddr1();
		String getAddr2 = m.getAddr2();
		int age = m.getAge();

		// print(name,email.zipcode,Addr1,Addr2,age) 이런 식으로는 에러 뜸! 하지마세요

		System.out.println(name);
		System.out.println(email);
		System.out.println(Zipcode);
		System.out.println(getAddr1);
		System.out.println(getAddr2);
		System.out.println(age);
	}


	
	public static void print(String name, String email,
			String zipcode, String addr1, String addr2, 
			int age) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(age);
	}

	// 이거는 별로 안 좋은 코드!! 노가다 뭐하는 짓이여..이런 거 쓸거면 클래스 필요가 없음

	/*
	 * public static void print(String name, String email, String zipcode, String
	 * addr1, String addr2, int age){ System.out.println(name);
	 * System.out.println(email); System.out.println(Zipcode);
	 * System.out.println(getAddr1); System.out.println(getAddr2);
	 * System.out.println(age); }
	 */

	// public static void print(Member m){} 이런 코드가 엄청 좋은거임

	public static void main(String[] agrs) {
		Member m = new Member();
		
		// ctrl 누르고 setName 누르면 위치가 어디있는지 알려줌
		//m.name = "성영한"
		m.setName("성영한");
		m.setEmail("syh@hbilab.org");
		m.setZipcode("09876");
		m.setAddr1("서울 용산구 이태원동");
		m.setAddr2("한강아파트 110동 ");
		m.setAge(30);
		print(m);

		/*
		String name = m.getName();
		System.out.println(name);
		*/
		
	}

}

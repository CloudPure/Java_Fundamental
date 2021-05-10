package java_20210510;
public class AdminDemo {

	public static void main(String[] args) {
		
		// 1)
		Admin a = new Admin("syh1011","123","syh@hbilab.org",20);
		// 2) 이거 밑에 코딩보다 1) 이렇게 코딩하는게 훨씬 낫다. + 가독성이 더 좋다.
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		// 2)
		Admin a1 = new Admin();
		a1.setId("syh1011");
		a1.setPwd("123");
		a1.setEmail("syh@hbilab.org");
		a1.setLevel(20);
		

	}

}

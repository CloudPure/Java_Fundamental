package java_20210510;



public class MemberPayDemo {
	public static void main(String[] args) {
		MemberPay m = new MemberPay();
		m.setSeq(1); // 예전에는 m.seq = 1; 이렇게 했는데 지금은 안되기 때문에 이렇게 코딩함!!
		m.setGroup(2);
		m.setName("자바 일주일만에 완성하기");
		m.setPrice(500_100);
		m.setStatus("1");
		m.setValid(true);
		m.setSdate("2021-05-10");
		m.setEdate("2021-12-31");
		m.setRegdate("2021-05-10");
		
		System.out.println(m.getSeq());
		System.out.println(m.getGroup());
		System.out.println(m.getName());
		System.out.println(m.getPirce());
		System.out.println(m.getStatus());
		System.out.println(m.isValid());
		System.out.println(m.getSdate());
		System.out.println(m.getEdate());
		System.out.println(m.getRegdate());
	}

}

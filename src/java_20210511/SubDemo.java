package java_20210511;

public class SubDemo {
	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();
		
		sub.play("~~~");
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		
		// 오른쪽과 왼쪽은 다른 경우임
		Super sup1 = new Sub();
		System.out.println(sup1.money);
		sup1.makeMoney();
		sup1.play("~~");
		
		// 찍어보면 이런 거 숫자 막 나옴
		// 근데 여기 이해하면 (sub.toString); 숨어있음! 근데 sub이랑 sub.toString이랑 똑같이 나옴
		System.out.println(sub.toString());
		System.out.println(sub);
		
		Object obj = new Sub();
		System.out.println(obj.toString());
		
		
	}
}

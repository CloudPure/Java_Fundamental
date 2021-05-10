package java_20210506.bb;
import java_20210506.aa.Notice;
public class NoticeDemo2 extends Notice{

	public static void main(String[] args) {
		// 서로 다른 패키지의 클래스를 사용하기 위해서는
		// import 구분을 사용해야 한다.
		// Package → import → Class 순으로 코딩해야 한다.
		Notice n1 = new Notice();
		n1.number = 1;	// public 서로 다른 패키지에서도 접근 가능
		
		//public 말고는 안 보임!!
		//n1.title = "";	// protected 서로 다른 패키지에서 접근하려면 상속을 받은 경우에만 가능함.
		//n1.hit = 10;	// default 서로 다른 패키지에서 접근 불가능
		//n1.regdate = "";	// private 서로 다른 패키지에서 접근 불가능
		
		NoticeDemo2 n2 = new NoticeDemo2();
		n2.number = 2;
		n2.title = "";	// 자식이 상속을 받음! (public class NoticeDemo2 "extends Notice"{)
						// protected 서로 다른 패키지에서 접근하려면 상속을 받은 경우에만 가능함.
		// n2.hit = 10;
		// n2.regdate = "";
		// 부모 꺼는 내 꺼고 내 꺼도 내꺼임!!ㅋㅋㅋㅋㅋ
	}

}

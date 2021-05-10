package java_20210506.aa;

public class NoticeDemo {

	public int number;
	protected String title;
	int hit;
	private String regdate;

	public static void main(String[] args) {
		// notice 클래스를 메모리 한거나 똑같다는 의미임!!
		Notice n = new Notice();
		n.number = 1; // public 접근가능
		n.title = "공지사항입니다."; // protected 접근가능, 서로 다른 패키지이면서 상속을 받은 경우만 접근 가능
		n.hit = 0; // default 접근가능
		//n.regdate = "2021-05-06"; // private 접근 불가능
		
	}

}
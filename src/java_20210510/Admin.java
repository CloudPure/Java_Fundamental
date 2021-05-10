package java_20210510;


public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	// 디폴트 생성자(매개변수 없는 생성자)
	// 생성자 → [접근한정자] [클래스 이름](){}
	// 생성자는 반환값이 없음.
	// 생성자의 역할은 인스턴스 변수 초기화
	// 생성자는 오버로딩(overloading)이 가능
	// 매서드는 내가 맘대로 해도 되지만 생성자는 안됨!
	
	// public 아니면 default야~!!
	// 생성자의 접근 한정자는 인스턴스(new)의 유무를 결정한다.
	public Admin() {
		// 이거 안 만들면 다른 java 파일(AdminDemo.java)에 오류 남!!
		// public 안쓰고 private로 하면 에러남 →
		// 생성자,클래스 무조건 public 99.9%
		// 이거 몰라도 코딩 못합니까? 아니요 몰라도 코딩 잘할 수 있어요ㅋㅋㅋ
		// 근데 이렇게 public Admin() 이렇게 만드는 사람은 드물다
		
		// super();
	}
	
	// this의 용법 2가지
	// 1. 자기자신 객체 → 'this' or 'this.' → 위치는 메서드, 생성자 모두 사용
	// 2. 다른 생성자를 호출 → this(~) → 위치는 생성자에서만 사용 가능
	
	
	public Admin(String id, String pwd, String email) {
		this(id,pwd,email,0);
		// 이렇게 코딩하면 혼나! 별로임!
		// 잘못된 방법은 아니긴 함. 하지만 반드시 이 방법은 아님!
	}
	
	
	public Admin(String id, String pwd, String email, int level) {
		// super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getEmail() {
		return email;
	}
	public int getLevel() {
		return level;
	}
	

}

package java_20210513;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		
		String str1 = s1.toString();
		String str2 = s2.toString();
		
		System.out.println(str1.equals(str2));
		
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");
		sql.append("from meber ");
		sql.append("where name = '성영한' ");
		
		/* 회사가면 위에처럼 코딩 안하고(원리와 메모리 구조 모르기 때문에) 아래처럼 노가다 작업함ㅋㅋㅋㅋ
		
		String sql1 = "select name, age ";
		sql1 += "from meber";
		sql1 += "where name = '성영한' "
		sql1 +=
		sql1 +=
		*/
		
		System.out.println(sql);
		
		// sql의 모든 문자열 지우기
		sql.setLength(0);
		sql.append("select no, writer form board");
		System.out.println(sql);
	}
}

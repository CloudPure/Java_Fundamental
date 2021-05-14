package java_20210512;

public class MathDemo {
	public static void main(String[] args) {
		// 소수점 무조건 올리겠다 ceil 사용
		double d = Math.ceil(4.3);
		System.out.println(d);
		
		// 소수점 무조건 내리겠다 floor 사용
		d = Math.floor(4.9);
		System.out.println(d);
		
		// 반올림 하는 거
		int i = Math.round(2.6f);
		System.out.println(i);
		
		// 버리는 거
		long I = (int) Math.round(4.2);
		System.out.println(I);
		
		
		// double로 해야되는데 위에 이미 선언했기 때문에 d로 입력
		d = Math.abs(-4.2);
		System.out.println(d);
		
		d = Math.max(4.2, 5.2);
		System.out.println(d);
		
		d= Math.min(2.4, 1002.56);
		System.out.println(d);
		
		// 선생님은 (int) 쓰는 걸 별로 안 좋아해서 앞에다가 long을 사용하심ㅋㅋ
		d = (long) Math.sqrt(2);
		System.out.println(d);
		
		// 2의 3승은 8!! 그래서 정답은 8.0으로 출력됨
		I = (long) Math.pow(2, 3);
		System.out.println(d);
		
		d = Math.random();
		System.out.println(d);

	}
}

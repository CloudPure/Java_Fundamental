package java_20210504;

public class LotteryDemo {

	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의 double 반환

		// 값이 모르니까 [] 이거를 씀!
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			// 1보다 크거나 같고 45보다 작은 임의의 int 반환
			int random = (int) (Math.random() * 45) + 1;
			boolean isExisted = false;

			// 핵심코드
			for (int j = 0; j < i; j++) {
				if (random == lotto[j]) {
					isExisted = true;
					
					// break 안 달면 큰일남!
					break;
				}
			}
			if (isExisted) {
				// ex) i=2인데 위로 올라가면 i가 3으로 가면 안됨!! 아직 i=2에 값이 안 넣어졌기 때문에
				// 중복 검사하고 있는데 i=3으로(다음으로) 넘어가게 되면 i=2에 값이 아직 안 정해져 있다.
				i--;
			} else {
				lotto[i] = random;
			}

			
			  //for (int i = 0; i < lotto.length; i++) { 
				 System.out.print(lotto[i] + "\t"); }
			
		}
	}


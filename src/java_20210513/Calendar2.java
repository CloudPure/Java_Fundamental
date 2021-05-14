package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar2 {
		private Calendar cal;
		public Calendar2() {
			cal = Calendar.getInstance();
		}
		
		public void print(int year, int month, int day) {
		// 이렇게 하면 현재 날짜가 나옴 : Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM년 dd일 E요일 입니다.");
		
		// cal 으로만 출력하면 에러 뜸 그래서 cal.getTime()으로 해야됨
		System.out.println(sdf.format(cal.getTime()));
		
	}
	
	// [1] 흐름을 쫓아가기!!
	public void print(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println(year+ "년 "+month+"월 달력입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		// 탭만큼  띄어쓰기 해야한다. ex)2021년 5월 달력을 출력하기 위해서는
		// 2021년 5월 1일까지 총 날짜를 구해서 77로 나눈 나머지만큼 띄어쓰기 하면 된다.
		
		cal.set(year, month-1, 1);
		
		// 1→일요일, 2→월요일, 3→화요일, ... 7→토요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int count = 0;
		for(int i=0; i<dayOfWeek-1; i++) {
			System.out.print("\t");
			count++;
		}
		
		// cal.getActualMaximum(Calendar.DATE) 마지막 날짜
		for(int i=1; i<=cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i+"\t");
			//count++;
			if(count %7 == 6) System.out.println();
			count++;
		}
		
		System.out.println();
	}
	
	public void print(int year) {
		for(int i = 1; i <= 12; i++) {
			print(year, i);
		}
		
	}

}

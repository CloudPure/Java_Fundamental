package java_20210513;

import java.text.SimpleDateFormat;	// ctrl + shift + o 사용해서 import 해주기!!
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		System.out.printf("%d년 %d월 %d일 %n", year, month+1, day);
		// 월만 0부터 시작해! 그래서 +1 해줘야함!! 그래서 출력할 때 month가 아닌 month+1임
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d : %d : %d %n", hour, minute, second);
		
		// 한 주에 몇번째의 일수에 생각하는거
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		
		StringBuffer message = new StringBuffer();
		if(dayOfWeek == Calendar.SUNDAY) {
			message.append("일요일");
		}else if(dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");
		}else if(dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");
		}else if(dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");
		}else if(dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");
		}else if(dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");
		}else if(dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다. %n", year, month+1, day, message.toString());
		
		// 위에처럼 복잡하게 할 것이냐? 아니면 아래처럼 간단하게 할 것이냐? 의 차이!
		// 작년 이 날에는 무슨 요일일까요?
		// cal.set() 안에 1~12월 넣을 때 내가 만약 2월 찍고 싶으면 숫자 1로 넣어야 함!
		cal.set(2021, 1, 13);	// 날짜를 변경할 때 사용하는 메서드
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초 E요일"); 
		Date d = cal.getTime();
		String display = sdf.format(d);
		System.out.println(display);
		
		// 해당 월에 마지막 날짜를 반환
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
	}
}

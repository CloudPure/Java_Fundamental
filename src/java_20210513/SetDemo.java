package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		// LinkedHashSet 클래스는 데이터의 중복을 허용하지 않고, 순서는 FIFO(처음 들어간 게 처음 나온다)
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(12);
		set.add(43);
		set.add(15);
		set.add(27);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		// HashSet 클래스는 자체적으로 출력할 방법이 없음.
		// HashSet을 Iterator로 변환해서 출력해야 함.
		Iterator i = set.iterator();
		while(i.hasNext()) { // hasNext() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드, 있으면 True, 없으면 False
			Integer temp = (Integer)i.next();
			System.out.println(temp);
		}
		
		
		StringBuffer s1 = new StringBuffer("a");
		StringBuffer s2 = new StringBuffer("a");
		// HashSet 클래스는 데이터의 중복을 판단할 때 equals()로 비교해서 true가 나오거면 데이터가 중복되었다고 판단하여 데이터를 추가해 주지 않음
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		
		HashSet set1 = new HashSet();
		set1.add(s1);
		set1.add(s2);
		
		System.out.println(set1.size());
		
		// TreeSet 클래스는 데이터의 중복을 판단할 때 CompareTo()로 비교해서 0이 나오거면 데이터가 중복되었다고 판단하여 데이터를 추가해 주지 않음
		TreeSet set2 = new TreeSet();
		set2.add(s1);
		set2.add(s2);
		System.out.println(set2.size());
		
	}
}

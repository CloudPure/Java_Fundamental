package java_20210510;
import java.lang.*;

public class CallByValueRefDemo extends Object{
	/*public static int[] ascending(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length - (i + 1); j++) {
				if (temp[j] > temp[j + 1]) {
					int temp2 = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = temp2;
				}
			}
		}
		return temp;
		// void가 아니라 int이기 때문에 return을 해야함!
	}
	*/
	public static void ascending(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length - (i + 1); j++) {
				if (temp[j] > temp[j + 1]) {
					int temp2 = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = temp2;
				}
			}
		}
	}
	
	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 400;
	}
	
	public static void main(String[] args) {
		int i =10;
		int[] j = {1,2,3,4};
		System.out.println(i + "," + j[3]);
		change(i,j);
		System.out.println(i + "," + j[3]);
		
		/*
		int[] lotto = {3, 5, 12, 45, 23, 1}; // 중복되지 않는 로또번호! 그런데 정렬이 안 되어있어!
		int[] lotto2 = ascending(lotto);
		for(int value : lotto2) {
			System.out.print(value+"\t");
		}
		*/
		int[] lotto = {3, 5, 12, 45, 23, 1}; // 중복되지 않는 로또번호! 그런데 정렬이 안 되어있어!
		ascending(lotto);
		for(int value : lotto) {
			System.out.print(value+"\t");
		}
		
	}

}

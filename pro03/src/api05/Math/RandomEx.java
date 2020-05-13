package api05.Math;

import java.util.Arrays;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 13.
 * @Description : Random
 */
public class RandomEx {

	public static void main(String[] args) {
		System.out.println("절대값: "+Math.abs(-10));
		System.out.println("최대값: "+Math.max(10, 30));
		System.out.println("최소값: "+Math.min(1.5, 1.3));
		System.out.println("2의 3승: "+(int)Math.pow(2, 3));
		
		double r=(int)(Math.random()*100);
		System.out.println("0~1 : "+r);
	
		String[] array=new String[] {"김경은", "지명관", "최정윤", "장경민", "임정민","유승아", "진영수"};
		int index=(int)(Math.random()*array.length);
		System.out.println("사다리: "+array[index]+"\t\t");
		
		int num=(int)(Math.random()*6)+1;	//1~6
		System.out.println("주사위 눈: "+num);
		
		//로또 1~45 숫자 6개
		int[] selectNumber=new int[6];
		for(int i=0; i<selectNumber.length;i++) {
			selectNumber[i]=(int)(Math.random()*45)+1;
		}
		for(int i=0; i<selectNumber.length;i++) {
			System.out.print(selectNumber[i]+"\t");
		}
		Arrays.sort(selectNumber);
		System.out.println(Arrays.toString(selectNumber));
		
	}

}

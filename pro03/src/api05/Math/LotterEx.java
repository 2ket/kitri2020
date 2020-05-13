package api05.Math;

import java.util.Arrays;

public class LotterEx {

	public static void main(String[] args) {
		while(true) {
			int[] selectNumber=new int[6];
			for(int i=0; i<selectNumber.length;i++) {
				selectNumber[i]=(int)(Math.random()*45)+1;
			}
			int[] machineNumber=new int[6];
			for(int i=0; i<machineNumber.length;i++) {
				machineNumber[i]=(int)(Math.random()*45)+1;
			}
			boolean result=Arrays.equals(machineNumber, selectNumber);
			if(result) {
				Arrays.sort(selectNumber);
				System.out.println("편의점 방문: "+Arrays.toString(selectNumber));
				break;
			}
			
		}
	}

}

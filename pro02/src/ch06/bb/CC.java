package ch06.bb;

import ch06.aa.AA;

public class CC extends AA{	
	public void disp() {
//		System.out.println(super.x); x가 private라...
		System.out.println(super.y);
		System.out.println(super.z);
		
//		System.out.println(super.su); default 패키지 달라지면 무조건 못씀
		
	}
}

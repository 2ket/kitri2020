package ch06.phoneInterface;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 8.
 * @Description : 	
 * 					스마트폰의 모델 스펙은 아래와 같다
 * 					제품명	전화송수신	3G&LTE&4G	TV리모컨기능
 * 					Lphone	    가능		3G			탑재
 * 					Sphone	   가능		LTE			탑재
 * 					Iphone	   가능		5G			미탑재
 * 
 */
public class PhoneMain {
	public static void main(String[] args) {
		Phone[] phone=new Phone[3];
		phone[0]=new Lphone();
		phone[1]=new Sphone();
		phone[2]=new Iphone();
		
		for(int i=0; i<phone.length; i++) {
			phone[i].callSend();
			phone[i].canData();
			phone[i].tvRemote();
			System.out.println();
		}
	}
}

package ch05.object.test;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 6.
 * @Description : 함수 중복 - Overload, / overloading
 * 					함수명은 같지만 파라미터 타입이나 개수가 달라야 한다.
 * 
 * 
 * 생성자 중복은 객체 생성시 파라미터값으로 던져줌
 * 생성자 중복 쓸수밖에 없냐면 클래스명과 생성자 같아야해서. 같아야지만 생성자 만들수있음 
 * 생성자 중복은 중복을 쓸수밖에 없는 이유가 객체를 생성할때마다 다르기 때문 생성자와 클래스 명이 같아야만 쓸 수 있기에 중복을 처리할수밖에 없음.
 * 함수는 내가 만드는거니까 중복이 없응ㄹ 수도 있지 않나 싶지만 실무에서 함수중복 굉장히 많이씀. 비슷한 기능을 쓰는 함수들이 많은데 이름을 다르게 주면 못찾아요.
 * 함수에서 정수형연산 실수형연산 함수 두개 만들수밖에없음(자료형이다르니까)
 * 
 * 함수로 데이터 던지는데 덧셈연산. 10,20 주고 덧셈시킬거인데 정수형 int x, int y / 실수형 두개 던지면 float x, float y 두개를 만들어야함
 * 생성자는 클래스와 생성자 이름이 다르면 무조건 에러.
 * 
 * 
 */
class FF{
	public void disp(int x) {
		System.out.println(x);
	}
	
	public void disp(int x, float y) {
		System.out.println(x+"\t"+y);
	}
	
	public void disp(String str) {
		System.out.println(str);
	}
	
	public int hap(int x, int y) {
//		System.out.println(x+y);
		return x+y;
	}
	
	public float hap(float x, float y) {
//		System.out.println(x+y);
		return x+y;
	}
}

public class Exam26 {
	public static void main(String[] args) {
		FF f=new FF();
		f.disp(10);
		f.disp("apple");
		f.disp(77, 88.8f);
		
		System.out.println(f.hap(5, 6));
		System.out.println(f.hap(66.7f, 99.8f));

	}

}

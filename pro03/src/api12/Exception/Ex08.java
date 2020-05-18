package api12.Exception;

public class Ex08 {

	public static void main(String[] args) {
		
		try {
			int su=Integer.parseInt(args[0]);
			int value=Integer.parseInt(args[1]);
			
			int div=su/value;
			System.out.println(div);
		}catch(NumberFormatException e) {
			System.out.println("반드시 정수형을 입력하세요.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 수가 잘못되었습니다.");
		}finally {
			System.out.println("모든 예외처리를 끝냈다.");
		}
		
		
	}

}

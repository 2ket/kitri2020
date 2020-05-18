package api12.Exception;

public class Ex05 {

	public static void main(String[] args) {
		
		try {
		String data=null;
		System.out.println(data.toString());
		}catch(NullPointerException	e) {
			System.out.println("값을 입력하세요");
		}
	}

}

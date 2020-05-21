package thread07.Synchronized;

public class Ex {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();	//공유객체
		
		Hong hong=new Hong();
		hong.setCaculator(calculator);
		hong.start();
		
		Cho cho=new Cho();
		cho.setCaculator(calculator);
		cho.start();
	}

}

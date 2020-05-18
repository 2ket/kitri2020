package api12.Exception;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : 	메인함수의 String[] args 사용한 예제. run configuration사용
 */
public class Ex03 {

	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++) {
//			System.out.println(args[i]);
			
			int su=Integer.parseInt(args[i]);
			System.out.println(++su);
		}
		
		
//		String su=args[0];
//		String value=args[1];
		
	}

}

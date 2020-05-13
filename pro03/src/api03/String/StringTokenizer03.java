package api03.String;
import java.util.StringTokenizer;
/**
 * @Author : 김경은
 * @Date : 2020. 5. 13.
 * @Description : 	
 */
public class StringTokenizer03 {

	public static void main(String[] args) {
		String strText="홍길동/이영자/조인성";
		StringTokenizer st=new StringTokenizer(strText, "/");
		System.out.println("count:"+st.countTokens());
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();	//토큰을 하나씩 꺼내옴
			System.out.println(st.countTokens()+"\t"+token);
		}
		
		//결과 안나옴 분리 다 끝남
		while(st.hasMoreTokens()) {
			String token=st.nextToken();	
			System.out.println(st.countTokens()+"\t"+token);
		}
		System.out.println();
		
		String strValue="홍길동/이영자*조인성";
		StringTokenizer stoken=new StringTokenizer(strValue, "/");
		while(stoken.hasMoreTokens()) {
			String token=stoken.nextToken();
			System.out.println(token);
			
			StringTokenizer ken=new StringTokenizer(token, "*");
			while(ken.hasMoreTokens()) {
				System.out.println(ken.nextToken());
			}
		}
		
	}

}

package api03.String;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 13.
 * @Description :	인코딩 / 디코딩
 */
public class String03 {

	public static void main(String[] args) throws Exception{
		String str="안녕하세요";	//binary로 바꾸는 작업 필요(채팅프로그램)
		byte[] array=str.getBytes();	//인코딩
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		
		//디코딩 String(byte[])
		String value =new String(array);
		System.out.println(value);
		
		// charset 있는 경우
		String string="반가워요";
		byte[] byArr=string.getBytes("utf-8");	//euc-kr(한글특화), iso-8859-1(영어위주), utf-8(전세계)
		String byStr=new String(byArr, "utf-8");
		System.out.println(byStr);
		
		
	}

}

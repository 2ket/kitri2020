package api03.String;

public class StringBuffer01 {

	public static void main(String[] args) {
		String s1="새천년";
		String s2="대한민국";
		String s3=s1;
		System.out.println("s1 hash code"+s1.hashCode());
		System.out.println("s2 hash code"+s2.hashCode());
		System.out.println("s3 hash code"+s3.hashCode());
		
		//자바는 메모리를 억세스하지 않음. 다이렉트로 억세스하는건 씨언어뿐
		
		s1+= s2;
		System.out.println(s1);
		System.out.println("s1 hash cod: "+s1.hashCode());
		//문자열의 합은 기존 메모리 공간에 저장하는것이 아닌, 새로운 공간에 저장함
		//따라서 대용량 문자열들의 합을 이용해야할때(예를 들어 주소 라던가)엄청난 메모리 낭비가 일어남
		//이를 해결하기 위한게 StringBuffer. 대신 데이터 적은거 처리할땐 StringBuffer가 더 낭비
		
		StringBuffer sb1=new StringBuffer("우리나라");
		StringBuffer sb2=new StringBuffer("대한민국");
		System.out.println("sb1 hash code:"+sb1.hashCode());
		System.out.println("sb2 hash code:"+sb2.hashCode());
		
		sb1.append(sb2);
		sb1.append("좋은나라");
		System.out.println(sb1);
		System.out.println("sb1 hash code:"+sb1.hashCode());
		System.out.println();
		//StringBuffer로 append하여 추가하면 공간이 같은곳에 저장하게됨.
		//기존공간에 계속 저장하므로 데이터 절약이 됨.
		
		StringBuffer str=new StringBuffer("apple");
		System.out.println("문자열의 길이:"+str.length());
		System.out.println("문자열의 용량(byte):"+str.capacity());	//5+16=21
		//단어 두세개 쓸거면 16byte더 가지고 시작하는 StringBuffer보단 string쓰는게 낫다.
		
		
	}

}

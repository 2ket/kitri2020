package api06.Quiz;

public class Quiz28 {
	public static void main(String[] args) {
		String fullPath="c:\\jdk1.5\\work\\PathSeparateTest.java";
		
		int idx=fullPath.indexOf("P");
		System.out.println(fullPath.substring(idx));
	}
}

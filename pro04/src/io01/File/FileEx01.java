package io01.File;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 18.
 * @Description : 	입력 : 키보드, 파일(업로드), 네트워크(챗팅)
 * 					출력 : 화면, 파일(다운로드), 네트워크(챗팅)
 */


import java.io.File;
public class FileEx01 {

	public static void main(String[] args) {
		File[] roots=File.listRoots();
		
		for(int i=0; i<roots.length; i++) {
			System.out.println(roots[i]);
		}
		
		File file=new File("C:\\Kitri2020\\java\\workspace\\pro03\\src\\api12\\Exception");
		if(file.exists()) {
			String[] str=file.list();
			
			for(int i=0; i<str.length; i++) {
				System.out.println(str[i]);
			}
		}
		
		File temp=new File(file, "Ex04.java");
		System.out.println("디렉토리 존재 : "+temp.exists());
		System.out.println("파일 존재 : "+temp.isFile());
		
		if(temp.exists() && temp.isFile()) {
			System.out.println("파일명: "+temp.getName());
			System.out.println("경로명: "+temp.getParent());
			System.out.println("파일 & 경로명 : "+temp.getAbsolutePath());
			System.out.println("쓰기가능 : "+temp.canWrite());
			System.out.println("읽기가능 : "+temp.canRead());
			System.out.println("파일크기 : "+temp.length()+" byte");
		}
	}

}

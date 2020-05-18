package io01.File;

import java.io.File;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args){
		File dir=new File("C:\\MyDir");
		System.out.println(dir.exists());
		
		if(dir.exists()==false) {
			dir.mkdir();	//디렉토리가 만들어진다.
			System.out.println("디렉토리 생성");
		}
		
		File file=new File(dir, "abc.txt");
		try {
			if(dir.exists()==true && file.isFile()==false) {
				file.createNewFile();	//파일을 만들어준다.
				System.out.println("파일생성");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n");
		
		if(dir.exists()==true && file.isFile()==true) {
			file.delete();	//파일삭제
			dir.delete();	//디렉토리삭제
			System.out.println("삭제되었습니다.");
		}
	}

}

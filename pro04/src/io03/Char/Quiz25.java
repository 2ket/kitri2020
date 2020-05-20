package io03.Char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Quiz25 {

	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			file=new File("C:\\Kitri2020\\java\\fileUpDown\\input\\quiz25.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			while(true) {
				String hang=br.readLine();		//파일에서 줄 단위로 hang에 저장
				if(hang==null) break;
				
				String[] str=hang.split(" ");	//한줄에 있는 문자들 " " 기준으로 문자열str로 저장
				int hap=0;
				for(int i=0; i<str.length; i++) {
					int su=Integer.parseInt(str[i]);	//쪼개놓은 str[i]을 숫자로 변환
					hap+=su;							//한 줄에 있던 숫자들을 다 더함
				}
				System.out.println("합은 : "+hap);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
				if(br!=null) br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}

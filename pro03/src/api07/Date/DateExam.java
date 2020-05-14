package api07.Date;

import java.util.Date;
import java.text.SimpleDateFormat;
public class DateExam {

	public static void main(String[] args) throws Exception{
		Date date=new Date();
		System.out.println(date.toString());	//2020-05-14 09:23
		
		System.out.print(date.getYear()+1900+"년도 ");
		System.out.print(date.getMonth()+1+"월 ");
		System.out.print(date.getDate()+"일\t");
		System.out.print(date.getHours()+"시 ");
		System.out.print(date.getMinutes()+"분 ");
		System.out.println(date.getSeconds()+"초");
		
		//캘린더클래스는 포맷팅이 어렵다.(날짜관련은 편함)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf4.format(date));
		System.out.println("\n========================================\n");
		
		//문자를 날짜 바꾸기
		String str="1980-12-25";
		Date strDate=sdf.parse(str);
		System.out.println(strDate);
	}

}

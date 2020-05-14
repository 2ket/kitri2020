package api07.Date;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class CalendarExam {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		System.out.println(today);
		
		//날짜 - 시간 바꿔야 한다.
		Date date=today.getTime();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println("\n\n");
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH)+1;
		int day=today.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		
	}

}

package api08.Quiz;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Quiz26 {

	public static void main(String[] args) {
		Sung a=new Sung("홍길동", 100, 70, 80);
		Sung b=new Sung("이순신", 88, 77, 66);
		Sung c=new Sung("강감찬", 70, 80, 70);

		ArrayList<Sung> sung=new ArrayList<Sung>(); 
		sung.add(a);
		sung.add(b);
		sung.add(c);
		
		Sung.title();
		for(int i=0; i<sung.size(); i++) {
			sung.get(i).disp();
		}
	}

}
class Sung{
	private String name;
	private int kor, eng, mat, tot;
	private float avg;
	
	public Sung() {}

	public Sung(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		total();
		average();
	}
	
	public void total() {
		tot=kor+eng+mat;
	}
	public void average() {
		avg=(float)tot/3.0f;
	}
	public void disp() { 
		DecimalFormat df=new DecimalFormat(".0");//Math.ceil((double)avg*10)/10
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+df.format(avg));
	}
	public static void title() {
		System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
	}
	
}
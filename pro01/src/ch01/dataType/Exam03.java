package ch01.dataType;

/**
 * @Author : 김경은
 * @Date : 2020. 4. 27.
 * @Description : 2) 단항연산자 : !, ~, +/-, ++/--, (cast) 또는 (자료형)
 */
public class Exam03 {

	public static void main(String[] args) {
		int x=10;
		++x;
		x++;
		System.out.println(x);
		
		--x;
		x--;
		System.out.println(x);
		
		int y=10;
		int z=++y;
		System.out.println(y+"\t"+z);
		
		int a=10;
		int b=a++;
		System.out.println(a+"\t"+b);
		
		int i=10;
		int j=20;
		int k=++i + ++j;//32
		int kk=++i + j++;//
		System.out.println(i+"\t"+j+"\t"+k+"\t"+kk);
		
		System.out.println("CAST(자료형) 연산자");
		byte su=10;
		short value=su; //byte, short, int, long
		System.out.println("value : "+value);
		
		int r = 77;
		byte rr = (byte)r;
		System.out.println(rr+"\n");
		
		float su1=55.5f;
		int su2=66;
		float result1=su1+su2;
		System.out.println(result1+"\n");
		
		int result2=(int)su1+su2;
		System.out.println(result2+"\n");
		
		int w=10;
		int q=3;
		float result3=(float)w/q;
		System.out.println(result3+"\t");
		
		System.out.println("W:"+w);
		System.out.println(w+q);
		System.out.println(w+" "+q);
		System.out.println("합계 : "+ (w+q));
		
		int p=10;
		System.out.println("p:"+ ++p);
		System.out.println(p);
	}

}

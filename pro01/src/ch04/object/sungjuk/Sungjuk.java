package ch04.object.sungjuk;

public class Sungjuk {
	public String name;
	public int kor;
	public int eng;
	public int mat;
	
	public int tot;
	public float avg;
	public char hak;
	
	public void input(String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}
	
	public void total() {
		tot=kor+eng+mat;
	}
	
	public void average() {
		avg=(float)tot/3;
	}
	
	public void grade() {
		if(avg>=90) hak='A';
		else if(avg>=80) hak='B';
		else if(avg>=70) hak='C';
		else if(avg>=60) hak='D';
		else hak='F';
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor+"\t"+eng+"\t"+mat);
		System.out.println(tot+"\t"+avg+"\t"+hak);
		System.out.println();
	}
	
}

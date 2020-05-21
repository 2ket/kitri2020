package thread09.Notify;

public class Ex {

	public static void main(String[] args) {
		WorkData data= new WorkData();		//공유 객체
		
		Hong a=new Hong(data);
		a.setName("a");
		Hong b=new Hong(data);
		b.setName("b");
		
		ChoPrducer x=new ChoPrducer(data);
		x.setName("x");
		ChoPrducer y=new ChoPrducer(data);
		y.setName("y");
		
//		a.start();
//		b.start();
//		x.start();
//		y.start();
		
	}

}

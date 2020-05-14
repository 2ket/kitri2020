package api08.Collection;

import java.util.ArrayList;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 14.
 * @Description : Data 클래스를 
 */
public class ArrayList02 {

	public static void main(String[] args) {
		Data a=new Data(10, 20);
		Data b=new Data(30, 40);
		Data c=new Data(50, 60);
		
		ArrayList<Data> list=new ArrayList<Data>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		for(int i=0; i<list.size();i++) {
			Data d=list.get(i);
			d.yonsan();
			d.disp();
		}
		System.out.println("\n\n");
		
		System.out.println(list.toString());
		System.out.println("\n\n");
		Data x=new Data(1,2);
		x.yonsan();
		list.add(x);
		System.out.println(list);
		
		Data y= new Data(1000, 2000);
		y.yonsan();
		list.set(0, y);
		System.out.println(list);
		
		System.out.println("\n\n");
		list.remove(1);
		System.out.println(list);
		
		
		System.out.println();
		for(Data data:list) {
			data.disp();
		}
	}

}

package api09.Map;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception{
		String path=PropertiesEx.class.getResource("data.properties").getPath();
		//src에 있는 공간이 아니라, class 파일이 있는 bins 에서 data.properties를 가져와라 라는 뜻
		System.out.println(path);
		
		Properties pro=new Properties();
		pro.load(new FileReader(path));
		
		Iterator<Object> iterator=pro.keySet().iterator();
		while(iterator.hasNext()) {
//			System.out.println((String)iterator.next());
			String key=(String)iterator.next();
			System.out.println(pro.get(key));
		}
	}

}

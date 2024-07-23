package Genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetPropertiesData {
		public String fetchData(String Key) throws IOException {
		FileInputStream fis=new FileInputStream("./Data/Dj.properties");
		Properties pObj=new Properties();
		pObj.load(fis);	
		
		String data = pObj.getProperty(Key);
		return data;
		}		
}

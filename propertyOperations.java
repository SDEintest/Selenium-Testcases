package Com.ipivot.CarsProject.utilities;

import java.io.IOException;
import java.util.Properties;

public class propertyOperations {
	Properties prop = new Properties();

	public propertyOperations() {
		try {
			prop.load(propertyOperations.class.getResourceAsStream("/propertiesFiles/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getPropertyValueByKey(String key){
		String str =  prop.getProperty(key);
		if(str == null || str == "") {
			System.out.println("Value found null / spaces in properties file for key: "+key);
		}
		return str;
	}
}




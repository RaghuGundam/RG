import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\configuration.properties");
		//System.out.println(fi.toString());
		Properties prop = new Properties();
		prop.load(fi);
        System.out.println(prop.getProperty("browsername"));
        System.out.println(prop.getProperty("appurl"));
        fi.close();
        
	}

}

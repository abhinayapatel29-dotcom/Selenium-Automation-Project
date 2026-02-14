package AbhinayaPatel.Framework;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readproperties {
    public static void main(String[] args) throws Exception{
    String filePath = System.getProperty("user.dir");
    filePath =filePath+"\\src\\main\\java\\AbhinayaPatel\\Framework\\read.properties";
    File file = new File(filePath);
    FileInputStream fileData = new FileInputStream(file);
    Properties prop = new Properties();
    prop.load(fileData);
    String namedata = prop.getProperty("name");
    System.out.println(namedata);
    System.out.println(prop.getProperty("age"));
    System.out.println(prop.get("gender"));
}
}

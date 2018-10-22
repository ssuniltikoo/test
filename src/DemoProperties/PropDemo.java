package DemoProperties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

        Properties ps = new Properties();
        try {
            ps.load(PropDemo.class.getResourceAsStream("app.properties"));
            System.out.println("App Name"+ ps.getProperty("app.name"));
            ps.setProperty("training.session","5");
            //FileOutputStream out = new FileOutputStream("D:\\PackageDemo\\prop2.xml");
            System.out.println(PropDemo.class.getResourceAsStream("app.properties"));
            FileOutputStream out = new FileOutputStream("D:\\PackageDemo\\prop2.xml");
            ps.storeToXML(out,"new file");
        }catch(IOException e){
            System.out.println();
        }

    }
}

package DataBaseDemo;

import java.io.*;
import java.nio.file.FileSystems;
import java.util.Properties;

@Author("TEST")
public class DBPropertiesFile {

    @Author("TEST")
    public static void main(String[] args) {
        Properties dbProp = new Properties();
        try {
            dbProp.load(DBPropertiesFile.class.getResourceAsStream("DataBaseFile.properties"));
            System.out.println(dbProp.getProperty("db.driver"));
            System.out.println(dbProp.getProperty("db.name"));
            System.out.println(dbProp.getProperty("db.user"));
            System.out.println(dbProp.getProperty("db.password"));
            System.out.println(dbProp.getProperty("db.url"));
            String mypath = System.getProperty("user.dir")+"\\src\\DataBaseDemo\\";
            FileInputStream in = new   FileInputStream(mypath+"DataBaseFile.properties");
            BufferedInputStream brin = new BufferedInputStream(in);


            //System.out.println(System.getProperty("user.dir")+"\\src\\DataBaseDemo\\");
            System.out.println();

            //FileInputStream in = new FileInputStream("\\");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }

}

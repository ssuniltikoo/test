package DemoIOSystem;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class FileDemo {

    public static void main(String[] args) {
        File fl = new File("D:\\PackageDemo");
       // File fl = new File(URI.create("file:///d/PackageDemo"));
        if(fl.exists())
            System.out.println("path exists");

        if(fl.isDirectory())
            System.out.println("is directory");
        else
            System.out.println("not a directory");

        File newfile = new File(fl,"dummy2.txt");
        if(newfile.exists())
            System.out.println(newfile.getName()+  " file already exists");
        else {
            try{
                System.out.println("file not exists..creating new one");
                newfile.createNewFile();
                System.out.println();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        }



    }
}

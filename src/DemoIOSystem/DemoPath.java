package DemoIOSystem;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

public class DemoPath {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("/users/Public");
        System.out.println(path.toString());
        System.out.println(path.toUri());
        System.out.println("index 0 " + path.getName(0));


        Iterator it = FileSystems.getDefault().getRootDirectories().iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

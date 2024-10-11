package jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Article {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("./demo.txt");
        fos.write(1);
        System.out.println("写出完毕");
        fos.close();
    }
}

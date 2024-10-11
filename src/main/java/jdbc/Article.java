package jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Article {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("./demo.txt");
        fos.write("向文件中写入了一个字符串".getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");
        fos.close();
    }
}

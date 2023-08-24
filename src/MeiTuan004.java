import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MeiTuan004 {
    //写入文件
    public static void main(String[] args){
        try {
            FileWriter fileWriter = new FileWriter("F1.txt");
            fileWriter.write("Files in Java might be tricky, but it is fun enough!");
            //输入完后需要关闭输入这个对象
            fileWriter.close();
            FileReader fileReader = new FileReader("F1.txt");
            System.out.println(fileReader.read());
            System.out.println("Successfully wrote to the file");
        }catch (IOException e){
            System.out.println();
            e.printStackTrace();
        }
    }
}

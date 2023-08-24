import java.io.File;
import java.io.IOException;

public class MeiTuan003 {

    public static void main(String[] args) {
//        MeiTuan003 meiTuan003 = new MeiTuan003();
//        meiTuan003.createFile();

        try {
            File file = new File("D:\\JDNetDiskDownload\\F1.txt");
            if (file.createNewFile()){
                //打印出文件名称
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e){
            System.out.println("An error occurred.");
            //System.out.println(e.printStackTrace());
        }
    }

//    public void createFile(){
//        File file = new File("D:\\JDNetDiskDownload\\F1.txt");
//    }
}

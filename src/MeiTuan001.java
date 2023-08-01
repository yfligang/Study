/*
将给定的字符串，按照规则删除字符，输出删除后的字符串。
删除规则为：相同字符连续，则删除，如”aaaab”删除后的字符串为”b” 。
注：仅是单个字符连续才删除，如babababa则不能删除
 */

import java.util.Scanner;

public class MeiTuan001 {
    //输入字符串
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();  //将输入的字符生成字符串
            //新建一个字符串，将没有重复的字符放进这个新字符串中
            StringBuilder sb = new StringBuilder();
            //使用i记录连续子串的头部
            for (int i = 0; i < str.length(); i++) {
                //j为移动指针，记录连续子串的尾部
                int j = i; //j是从子串的头部开始到尾部
                //若最后一个字符跟当前一样，则j后移一位
                while (j + 1 < str.length() && str.charAt(j) == str.charAt(j+1)){
                    j++;
                    if (i == j) {
                        //i和j相等说明不是连续的，拼接进入sb
                        sb.append(str.charAt(i));
                    }else {
                        //当前子串是连续的，跳过
                        i = j;
                    }
                }
            }
            if (sb.toString().equals("")){
                System.out.println("no");
            }else {
                System.out.println("不连续的字符串为 " + sb);
            }
        }
    }

    public static String strFun(String str){
        //新建一个字符串，将没有重复的字符放进这个新字符串中
        StringBuilder sb = new StringBuilder();
        return null;

    }

}

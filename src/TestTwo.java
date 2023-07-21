/*
Java Iterator 的学习
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestTwo {
    public static void main(String[] args){
        //创建一个ArrayList
        List<String> list = new ArrayList<>();
        //向ArrayList中添加元素
        list.add("1");
        list.add("2");
        list.add("China");
        list.add("USA");
        //打印集合中的数据
        System.out.println(list);
        System.out.println("================");

        //使用迭代器获取集合中的数据
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ,");
        }

        System.out.println("================");

        //使用remove方法删除集合中的元素
        it.remove();
        System.out.println(list);





//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            if (iterable.iterator().hasNext()){
//                System.out.println(list.get(i));
//            }
//        }
    }

}

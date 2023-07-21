public class TestOne {

    public void test(int[] array){
        //打印出传入数组中的所有元素
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " "); //打印出字符串了
        }
    }

    public static void main(String[] args){
        int[] array1 = {1,3,5,7,9};

        //定义一个int数组,长度为10  数组中的数据都为int值
        int[] array = new int[10];
        //向数组中添加数据
        array[0] = 10;
        array[1] = 11;

        for (int num:array
             ) {
            System.out.println(num);
        }

        //查找数组中的最大元素  将第一个元素设置为最大，然后将比这个元素大的数设置为最大的
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max){
                max = array[i];
            }
        }

        //System.out.println("数组中的最大值: " + max);

        TestOne testOne = new TestOne();
        testOne.test(array1);
    }
}

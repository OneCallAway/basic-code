package Demo03;

/**
 * @program: basic-code
 * @description: 遍历
 * @author: ty
 * @create: 2019-05-08 18:21
 *
 * 遍历数组，说的就是对数组当中的每一个元素进行逐一，挨个处理。默认的处理方式就是打印输出
 **/
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15,2,3,4,5};

        //原始输出方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //使用循环，次数确定=数组长度
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("+++++++++++++++++++++++++++");

        //int len = array.length;//长度
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

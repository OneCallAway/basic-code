package Demo04;

import java.util.Arrays;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-12 07:03
 *
 * java.util.Arrays 是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作
 *
 * public static String toString(数组) 将参数数组变成字符串，按照默认格式[元素1，元素2，元素3...]
 *
 * public static void sort(数组) 按照默认升序(从小到大)对数组的元素进行排序
 *
 * 1:如果是数组，sort默认按照升序大小从小到大
 * 2:如果是字符串，sort默认按照字母升序
 * 3:如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持
 **/
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(array);
        System.out.println(intStr);

        int[] array1 = {2,6,1,3,7};
        Arrays.sort(array1);
        //Arrays.toString可以直接变成字符串格式，不用自己通过for循环进行调整
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"a","c","d"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}

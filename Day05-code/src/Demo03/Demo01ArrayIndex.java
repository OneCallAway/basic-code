package Demo03;

/**
 * @program: basic-code
 * @description: 注意事项
 * @author: ty
 * @create: 2019-04-09 04:53
 *
 * 数组的索引编号从0开始，一直到“数组的长度-1”为止。
 *
 * 如果访问数组元素的时候，索引编号不存在，那么将会发生数组索引越界异常
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
 **/
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //错误写法,并不存在三号元素，所以发生异常
//        System.out.println(array[3]);
    }
}

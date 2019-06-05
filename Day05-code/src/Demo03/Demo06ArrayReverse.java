package Demo03;

/**
 * @program: basic-code
 * @description: 数组反转
 * @author: ty
 * @create: 2019-05-16 14:24
 *
 * 数组反转
 * 原有数组｛1，3，4，6｝
 * 反转数组｛6，4，3，1｝
 *
 * 不能使用新数组，只能用原有数组
 **/
public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        //遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("+++++++++++++++++++++++");

        //反转
        /*
        初始化语句：int min = 0,max = array.length - 1
        条件判断：min < max
        步进表达式：min++,max--
        循环体：用第三个变量反转
         */
        for (int min = 0,max = array.length - 1;min < max; min++,max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //打印反转后
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

}

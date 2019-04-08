package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-04-09 02:34
 **/
public class Demo01ArrayOne {
    public static void main(String[] args) {
        //动态初始化
        int[] array = new int[3];
        System.out.println(array);//地址值
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println(array[3]);//0

        //改变数组元素当中的内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array[0]);//0
        System.out.println(array[1]);//10
        System.out.println(array[2]);//20
    }
}

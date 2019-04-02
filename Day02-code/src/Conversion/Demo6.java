package Conversion;

/**
 * @program: OneM
 * @description: char
 * @author: ty
 * @create: 2018-12-03 15:45
 **/
public class Demo6 {
    public static void main(String[] args) {
        char zifu1 = '1';
        System.out.println(zifu1 + 0); //49

        char zhifu2 = 'A';

        char zifu3 = 'c';
        /*
        左侧是int类型，右边是char类型
        char --> int 从小到大
        发生了自动类型转换
         */
        int num = zifu3;
        System.out.println(num);

        char zifu4 = '中';
        System.out.println(zifu4 + 0);
    }
}

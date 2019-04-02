package Conversion;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2019-03-12 06:34
 *
 * 比较运算符
 *
 * 大于：>
 * 小于：<
 * 大于等于：>=
 * 小于等于：<=
 * 不等于：!=
 * 相等：==
 *
 *
 * 注意事项
 * 1：比较运算符的结果一定是一个boolean值，成立true不成立false
 * 2：如果进行多次判断不能连这写
 *数学当中写法，比如：1 < x < 3
 * 程序中不可以这样写
 **/
public class Demo08Operator {
    public static void main(String[] args) {
        System.out.println(10 > 5);
        int a = 10;
        int b = 12;
        System.out.println(a < b);

        System.out.println(a >= 100);
        System.out.println(a <= 100);
        System.out.println(a <= 10);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println(10 == 10);
        System.out.println(20 != 25);
        System.out.println(20 != 20);

        int x = 2;
        //System.out.println(1 < x < 3);
    }
}

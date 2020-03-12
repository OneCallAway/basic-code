package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-12 07:36
 *
 * java.util.Math 数学相关的工具类，提供了大量静态方法，完成与数学运算相关的操作
 *
 * public static double abs(double number) 获取绝对值,有多种取整
 * public static double ceil(double number) 向上取整
 * public static double floor(double number) 向下取整
 * public static long round(double number) 四舍五入
 *
 * Math.PI 圆周率常量
 **/
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(2.14));//2.14
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-2.3));//2.3
        System.out.println("====================");

        //向上取整
        System.out.println(Math.ceil(3.9));//4.0
        System.out.println(Math.ceil(3.1));//4.0
        System.out.println("=============");

        //向下取整,抹零
        System.out.println(Math.floor(3.1));//3.0
        System.out.println("===========");

        //四舍五入
        System.out.println(Math.round(3.5));//4
        System.out.println(Math.round(3.4));//3
        System.out.println("========");

    }
}

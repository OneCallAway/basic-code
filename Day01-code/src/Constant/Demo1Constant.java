package Constant;

/**
 * @program: OneM
 * @description: 常量
 * @author: ty
 * @create: 2018-12-03 04:39
 * 常量：在程序运行期间，固定不变的量
 * 字符串常量（双引号引起），整数常量，浮点数常量，字符常量(单引号引起来的单个字符 'A')，布尔常量（true，false），空常量（null）
 **/
public class Demo1Constant {
    public static void main(String[] args) {
        //字符串常量
        System.out.println("ABC");
        System.out.println(""); //字符串二个双引号中间的内容为空
        System.out.println("zxc");

        //整数常量
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        //浮点数常量
        System.out.println(0.1);
        System.out.println(0.3);

        //字符常量
        System.out.println('a');
        System.out.println('s');
        System.out.println('3');
        //System.out.println(''); 二个单引号中间必须有且仅有一个字符，没有不行
        //System.out.println('as');二个单引号中间必须有且仅有一个字符

        //布尔常量
        System.out.println(true);
        System.out.println(false);

        //空常量，不能用来打印输出
        //System.out.println(null);
    }
}

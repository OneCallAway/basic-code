package Conversion;

/**
 * @program: OneM
 * @description: 运算符
 * @author: ty
 * @create: 2018-12-20 09:19
 **/
public class Demo7 {
    public static void main(String[] args) {
        //二个常量进行数学运算
        System.out.println(30 + 20);

        //二个变量进行 数学运算
        int a = 20;
        int b = 30;
        System.out.println(a - b);

        //变量和常量混合使用
        System.out.println(a * 10);

        int x = 10;
        int y = 3;
        int result1 = x / y;
        System.out.println(result1);
        System.out.println(x % y); //取模余数1

        //int + double --> double + double (自动转换为数据大的类型)
        double result2 = x + 3.5;
        System.out.println(result2);
    }
}

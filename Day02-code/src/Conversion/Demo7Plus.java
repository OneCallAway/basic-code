package Conversion;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2018-12-20 09:31
 * '+'四种用法
 * 1：对于数值是加法
 * 2：char字符运算之前会提升为int类型,与int类型之间的关系表：ASCII,Unicode
 * 3:对于字符串String（不是关键字）来说，加好代表连接，任何数据类型和字符串进行连接时，结果都会变成字符串
 **/
public class Demo7Plus {
    public static void main(String[] args) {
        //字符串类型变量基本使用
        //数据类型 变量名 = 数据值
        String str1 = "Hello";
        System.out.println(str1);

        System.out.println("Hello" + "World");


        String str2 = "Java";
        //String + int --> String
        System.out.println(str2 + 20);

        //优先级问题
        //String + int + int
        //String +     + int
        //String
        System.out.println(str2 + 20 + 30);//Java2030

        System.out.println(str2 + (20 + 30));//Java50
    }
}

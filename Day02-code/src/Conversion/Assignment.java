package Conversion;

/**
 * @program: OneM
 * @description: 赋值运算
 * @author: ty
 * @create: 2019-03-02 18:13
 *
 *
 * 赋值运算符分为：
 * 基本赋值运算符，就是一个等号“=”，代表将右侧的数据交给左侧的变量
 * int a = 30;
 *
 * 复合赋值运算符：
 * +=   a += 3  相当于 a = a + 3
 * -=   a -= 3  相当于 a = a - 3
 * *=   a *= 3  相当于 a = a * 3
 * /=   a /= 3  相当于 a = a / 3
 * %=   a %= 3  相当于 a = a % 3  取模 余数
 *
 * 只有变量才可以用赋值运算符，常量不可以进行赋值
 * 复合赋值运算符隐含一个强制转换
 **/


public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        // a = a + 5;
        // a = 15;
        a += 5;
        System.out.println(a);

        int x = 10;
        /*
        x = x % 3;
        x = 10 % 3;
        x = 1;
         */
        x %= 3;
        System.out.println(x);



        byte num = 30;
        /*
        num = num + 5;
        num = byte + int
        num = int + int
        num = int
        num = (byte) int
         */
        num += 5;
        System.out.println(num);


        }
    }


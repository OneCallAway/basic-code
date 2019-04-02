package Conversion;

/**
 * @program: OneM
 * @description: 自增自减
 * @author: ty
 * @create: 2018-12-20 09:39
 * 自增：++
 * 自减：--
 *
 * 含义：让一个变量涨一个数字，或者让一个变量降一个数字1
 * 使用格式:写在变量名称之前或者写在变量名称之后
 * 使用方式：
 *      1:单独使用：不和其他操作混合，独立成为一个步骤
 *      2:混合使用：和其他操作混合，例如与赋值混合，或者打印操作混合
 * 使用区别
 * 1.在单独使用时，前++和后++没有任何区别，也就是++num和num++结果一样
 * 2.在混合使用，区分二种情况
 * A：如果是前++，变量立刻加一，然后拿着结果进行使用(先加后用）
 * ++i   i =  i + 1 --> i = i
 * B：如果是后++，首先拿着原有数值，然后再让变量加1（先用后加）
 * i++   i = i  --> i + 1
 *
 * 只有变量才可以使用自增自减运算符，常量不可发生改变不能用
 **/
public class Demo7Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);//10
        ++num1;
        System.out.println(num1);//11
        num1++;
        System.out.println(num1);//12
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //与打印操作混合
        int num2 = 20;
        //混合使用，先++，变量立马变成21，然后打印结果21
        System.out.println(++num2);//21
        System.out.println(num2);//21
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        int num3 = 30;
        //混合使用，后++，首先使用变量本来的值，然后在加1
        System.out.println(num3++);//30
        System.out.println(num3);//31
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        // 11 + 20 = 31
        System.out.println(result3);
        System.out.println(x);
        System.out.println(y);
    }
}

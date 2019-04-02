package Conversion;

/**
 * @program: OneM
 * @description:运算符
 * @author: ty
 * @create: 2019-03-12 07:07
 *
 * 一元运算符：只需要一个数据就可以操作的运算符，比如！（取反），自增++，自减--
 * 二元运算符：需要二个数据才可以进行操作的运算符，比如加法+，赋值=
 *
 * 三元运算符：需要三个数据才可以进行操作的运算符，
 * 格式：
 * 数据类型 变量名称 = 条件判断 ？ 表达式A ：表达式B
 * 逻辑：
 * 首先判断条件是否成立：
 * 如果成立为true，那么将表达式A赋值给左侧的变量；
 * 如果不成立为false，那么将表达式B赋值给左侧的表露：
 * 二者选其一
 *
 * 注意事项：
 * 1：必须同时保证表达式A和表达式B都符合左侧数据类型的要求
 **/
public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

    //    int max; //最大值
    // 数据类型 变量名称 = 条件判断 ？ 表达式A ：表达式B
    // 判断a > b 是否成立，如果成立将a的值赋值给max，如果不成立将b的值赋值给max，二者选其一
        int max = a > b ? a : b;
        System.out.println("最大值:" + max);

        System.out.println(a > b ? a : b);

        int result = 3 > 4 ? (int)2.5 : 10;
//        int result = 3 > 4 ? 2.5 : 10;  错误写法
        System.out.println(result);
    }
}

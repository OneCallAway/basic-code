package Conversion;

/**
 * @program: OneM
 * @description: 逻辑
 * @author: ty
 * @create: 2019-03-12 06:43
 *
 * 与 （并且）&&   全true，才是true，否则就是flase
 * 或 （或者）\\   至少有一个是true，就是true，全部都是flase，才是false
 * 非（取反） ！   本来是true，变成false，本来是false，变成true
 *
 * 短路：
 * 与“&&”，或“||” 具有短路效果，如果根据左边的已经可以判断得到最终结果，那么右边的代码将不再执行，从而节省一定的性能
 *
 * 注意事项：
 * 1：逻辑运算只能用户boolean值
 * 2：与，或需要左右各自有一个boolean值，但是取反只要有唯一的一个boolean值即可
 * 3：与，或两种运算符，如果有多个条件，可以连续写
 * 二个条件：条件A && 条件B
 * 多个条件：条件A && 条件B && 条件C
 *
 * tips：
 * 对于1 < x < 3的情况，应该拆成二个部分，然后使用运算符连接起来
 * int x = 2;
 * 1 < x && x <3
 **/
public class Demo09Logic {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(3 < 4 && 10 > 5);

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println(true);
        System.out.println(!true);
        System.out.println("======================================");


        int a = 10;
//      false && ...
        System.out.println(3 > 4 && ++a < 100);
//      从左边已经得到结果，所以右边代码不执行，短路效果
        System.out.println(a);
        System.out.println("==========================");

        int b = 20;
//        true || ...
        System.out.println(3 < 4 || ++b < 100);
//      从左边得到结果，右边不在执行
        System.out.println(b);
    }

}

package Conversion;

/**
 * @program: OneM
 * @description: 自动类型转换
 * @author: ty
 * @create: 2018-12-03 05:35
 * 当数据类型不一样时，将会发生数据类型的转换
 *
 * 自动类型转换（隐式）
 * 1：特点：代码不需要进行特殊处理，自动完成
 * 2：规则：数据范围从小到大
 *
 * 强制类型转换（显式）
 *
 **/
public class Demo4 {
    public static void main(String[] args) {
        System.out.println(1024); //整数，默认为int
        System.out.println(3.14); //浮点数，默认为double

        //左边为long类型，右边是默认的int类型（没有后缀L），左右数据类型不一样
        //等号将右侧的int常量交给左侧的long变量进行存储
        //int --> long,符合了数据范围从小到大的要求，所以发生了自动类型转换
        long num1 = 100;
        System.out.println(num1);

        double num2 = 1.2f;//如果不加后缀f，会默认为double类型造成二边都是double类型
        //float --> double ,符合从小到大的规则，发生自动转换
        System.out.println(num2);

        System.out.println("++++++++++++++++++++++++++++++强制类型转换++++++++++++++++++++++++++++++++++++++++");
        //左侧是float类型，右边是long类型
        //long --> float,范围是float更大，符合从小到大规则，所以也发生了自动转换
        float num3 = 30L;
        System.out.println(num3);


    }
}

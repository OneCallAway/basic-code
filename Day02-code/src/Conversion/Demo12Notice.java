package Conversion;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2019-03-16 14:52
 *
 * 对于byte/short/char 三种类型来说，如果右侧赋值的数值没有超过范围。
 * 那么javac编译器会自动隐含的为我们补上（byte）（short）（char）
 *
 * 1：如果没有超过左侧范围，编译器会不上强转
 * 2：如果右侧超过左侧范围，那么直接编译器报错
 **/
public class Demo12Notice {
    public static void main(String[] args) {
//      右侧确实是一个int数字，但是没有超过左侧范围
//      int --> byte,不是自动类型转换
        byte num1 = 30; //右侧没有超过左侧的范围
        System.out.println(num1);

        byte num2 = (byte) 128;//右侧超过左侧范围进行强制类型转换
        System.out.println(num2);
        /**
         * 因为java中的自动转型，因此System.out.println（（byte）128） 输出为-128。
         *
         * 在java中默认整型是int类型，int类型是4字节，32位。而byte类型是1字节，8位
         *
         * 而java中的二进制都是采用补码形式存储：
         * ⑴一个数为正，则它的原码、反码、补码相同
         * ⑵一个数为负，则符号位为1，其余各位是对原码取反，然后整个数加1
         *
         * 就int类型的128而言，：
         *
         * 原码为：0000 0000 0000 0000 0000 0000 1000 0000
         *
         * 因为为正数，所以补码与原码相同。
         *
         * 当（byte）128时，将int类型强制转换为byte类型。截断高24位，保留低8位，也就是1000 0000。
         *
         * 于是保存的就是1000 0000。（这里不用进行补码变化，因为直接截断的）
         *
         * 在System.out.println调用时，java类型系统会自动将byte类型转换为int类型，此时进行的是有符号左移操作，前24位全部为1，后8为位1000 0000。
         *
         * 然后以补码形式保存（取反加1）：1000 0000 0000 0000 0000 0000 1000 0000
         *
         * 因此System.out.println（（byte）128） 输出为-128，即1000 0000 0000 1000 0000
         */

//       int --> char 没有超过范围
//       编译器会自动补上一个隐含的（char）
        char zifu = /*(char)*/65;
        System.out.println(zifu);
    }
}

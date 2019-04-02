package Conversion;

/**
 * @program: OneM
 * @description: 强制转换
 * @author: ty
 * @create: 2018-12-03 05:51
 *强制类型转换
 * 1.特点：代码需要进行特殊的格式处理，不能自动完成
 * 2.格式：范围小的类型 范围小的变量名 = （范围小的类型） 原本范围大的数据
 *
 * 注意事项
 * 1.强制类型转换一般不推荐使用，因为会发生精度损失，数据溢出
 * 2.byte/short/char这三种类型都可以发生数学运算，比如加法“+”
 * 3.byte/short/char这三种类型在运算的时候，都会被首先提升为int类型，然后在计算。
 * 4.boolean 不能发生数据类型转换
 **/
public class Demo5 {
    public static void main(String[] args) {
        //int num = 100L; 右侧的数据类型范围大于左侧，类型不兼容会造成数据丢失 long --> int,不符合从小到大
        //System.out.println(num);
        int num = (int) 100L; //没有大于int的数据范围，数据不会溢出
        System.out.println(num);
        int num1 = (int) 6000000000000000L;//因为超过int数据范围所以需要加上后缀将long强制转换为int，同时数据会溢出
        System.out.println(num1);

        //double --> int 强制类型转换
        int num3 = (int) 3.5; //会造成精度损失
        System.out.println(num3);

        char zifu = 'A'; //字符型变量，字母A
        System.out.println(zifu + 1);//结果为66，ASCLL 48 --》0  65 --》A 97 --》a
        char zifu1 = 'B';
        System.out.println(zifu1 - 1);//65
        //一旦char类型进行了数学运行，字符就会按照一定的规则翻译成为一个数字

        byte num4 = 30;
        byte num5 = 30;
        // byte + byte --> int + int;
        int num6 = num4 + num5;
        System.out.println(num6);

        short num7 = 30;
        //byte + short --> int + int --> int
        int num8 = num4 + num7;
        //short num8 = (short)(num4 + num7) int强制转换为short，必须保证逻辑上真实大小本来就没有溢出
        System.out.println(num8);
    }
}

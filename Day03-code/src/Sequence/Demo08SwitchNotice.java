package Sequence;

/**
 * @program: OneM
 * @description: switch
 * @author: ty
 * @create: 2019-03-23 12:42
 *
 * switch语句使用的注意事项：
 * 1：多个case语句后面的数值不可以重复
 *             case 1:
 *                 System.out.println("AAA");
 *                 break;
 *             case 1:
 *                 System.out.println("BBB");
 *                 break;
 *
 *2:switch后面的小括号当中只能是下列数据类型：
 * 基本数据类型：byte/short/char/int
 * 引用数据类型:String字符串,enum枚举
 *
 * 3:switch语句格式可以很灵活:前后顺序可以颠倒，而且break语句还可以省略。
 **/
public class Demo08SwitchNotice {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("AAA");
                break;
            case 2:
                System.out.println("BBB");
                break;
            case 3:
                System.out.println("DDD");
                break;
            default:
                System.out.println("CCC");
                break;
        }
    }
}

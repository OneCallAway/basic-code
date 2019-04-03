package Demo01;

/**
 * @program: basic-code
 * @description: 数组
 * @author: ty
 * @create: 2019-04-03 14:34
 *
 * 数组：是一种容器，可以同时存放多个数据值。
 *
 * 特点：
 * 1：数组是一种引用数据类型
 * 2：数组当中的多个数据，类型必须统一
 **/
public class Demo01Array {
    public static void main(String[] args) {
        int score1 = 100;
        int score2 = 99;
        int score3 = 98;
        System.out.println(score3);//98
        score3 = 100;
        System.out.println(score3);//100
    }
}

package Sequence;

/**
 * @program: OneM
 * @description: doWhile
 * @author: ty
 * @create: 2019-03-23 14:56
 *
 * do-while循环的标准格式：
 * do{
 *     循环体；
 * }while(条件判断);
 *
 * 扩展格式：
 *
 * 初始化语句
 * do{
 *     循环体
 *     步进语句
 * }while(条件判断)
 *
 * do-while循环至少会执行一次
 **/

public class Demo11DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("AAA");
            i++;
        }while (i < 5);
    }
}

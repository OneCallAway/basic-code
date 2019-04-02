package Sequence;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2019-03-23 15:21
 *
 * 三种循环的区别：
 * 1：如果条件判断从来没有满足过，那么for循环和while循环将会执行0次，但是do-while循环会执行至少一次
 * 2:for循环的变量在小括号中定义，只有循环内部才可以使用,while循环和do-while循环初始化语句本来就在外面，
 * 所以出来循环之后还可以继续使用
 *
 **/
public class Demo13LoopDifference {
    public static void main(String[] args) {
        for (int i = 0; i < 0; i++) {
            System.out.println("aaa");
        }
//        System.out.println(i);  变量i只在for循环中使用

        int i = 0;
        do {
            System.out.println("AAA");
            i++;
        }while (i < 0);
        System.out.println(i);//1  do-while中 do{}里面的语句都会至少执行一次
    }
}

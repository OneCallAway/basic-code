package Sequence;

/**
 * @program: OneM
 * @description: for
 * @author: ty
 * @create: 2019-03-23 12:53
 *
 * 循环结构的基本组成部分，一般可以分成四部分：
 * 1:初始化语句：在循环开始最初执行，而且只做唯一一次
 * 2:条件判断：如果成立，则循环继续;如果不成立，则循环退出
 * 3:循环体：重复要做的事情内容，若干行语句
 * 4:步进语句：每次循环之后都要进行的扫尾工作，每次循环结束之后都要执行一次  (i++/++i)
 **/
public class Demo09For {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("我错了");
        }

        for (int i = 0; i < 5; ++i) {
            System.out.println("i:" + i);
            System.out.println("+++++++++++++++++");
            for (int j = 0; j < i; ++j) {
                System.out.println("j:" + j);
            }
        }
        for (int x = 0; x < 5; x++) {
            System.out.println("x:" + x);
            System.out.println("+++++++++++++++++");
            for (int d = 0; d < x; d++) {
                System.out.println("d:" + d);
            }
        }
    }
}

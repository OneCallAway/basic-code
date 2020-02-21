package Demo01;

import java.util.Scanner;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-27 18:52
 *
 * 题目：键盘输入两个int数字，并且求出和值
 **/
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入第一个数字");
        int a = sc.nextInt();

        System.out.println("输入第二个数字");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("结果是:" + result) ;
    }
}

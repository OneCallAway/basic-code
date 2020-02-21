package Demo01;

import java.util.Scanner;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-27 18:59
 *
 * 题目：键盘输入三个int数字，求出最大值
 **/
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入第一个数字");
        int a = sc.nextInt();

        System.out.println("输入第一个数字");
        int b = sc.nextInt();

        System.out.println("输入第一个数字");
        int c = sc.nextInt();

        //判断
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println(max);

    }
}

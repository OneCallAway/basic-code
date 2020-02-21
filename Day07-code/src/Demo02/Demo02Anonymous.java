package Demo02;

import java.util.Scanner;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-27 21:27
 **/
public class Demo02Anonymous {
    public static void main(String[] args) {
    
        //普通使用方法
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();*/

        //匿名对象的方法
        /*int num1 = new Scanner(System.in).nextInt();
        System.out.println(num1);*/

/*
        //使用一般写法传入参数
        Scanner sc = new Scanner(System.in);
        methodParam(sc);
*/
        //使用匿名对象进行传参
//        methodParam(new Scanner(System.in));

        //使用匿名对象作为返回值
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}

package Demo03;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-12 05:55
 * 静态不是直接访问非静态，但是非静态可以访问静态
 **/
public class MyClass {

    int num;//成员变量
    static int numStatic;//静态变量

    public void method(){
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态方法不能直接访问成员变量
//        System.out.println(num);
        //静态方法当中不能使用this关键字
//        System.out.println(this);
    }
}

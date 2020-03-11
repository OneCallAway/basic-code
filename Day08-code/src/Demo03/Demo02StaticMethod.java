package Demo03;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-12 06:09
 *
 * 一旦使用static修饰成员方法，那么这就成为了静态方，静态方法不属于对象，而是属于类的
 *
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
 * 如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它
 *
 * 无论是成员变量，还是成员方法，如果有有了static，都推荐使用类名称进行调用
 * 静态变量：类名称.静态变量
 * 精通方法：类名称.精通方法（）
 *
 * 注意：
 * 1：静态不能直接访问非静态
 * 因为在内存当中是先有静态内容，后有非静态内容，所以静态不是直接访问非静态，但是非静态可以访问静态
 * 2：静态方法当中不能使用this关键字
 * this代表当前对象，通过谁调用的方法，谁就是当前对象
 **/
public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可以直接通过类名称来调用
        MyClass.methodStatic();

        //对于本类当中的静态方法，可以忽略类名称
        myMethod();

    }

    public static void myMethod(){
        System.out.println("我的方法");
    }
}

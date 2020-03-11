package Demo03;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-12 06:21
 *
 * 根据类名称访问静态成员变量的时候，全程和对象就没有关系，只和类有关系
 * 当程序开始运行时，在方法区中有一块静态区，类中的静态变量会存放在静态区中，
 * 如果栈帧中根据类名称访问静态成员变量，会直接去方法区的静态区寻找，而不会去堆中，因为和对象没有关系
 **/
public class Demo03StaticStudent {

    public static void main(String[] args) {
        //设置教室，因为是静态变量，所以要通过类名称进行调用
        student.classRoom = "101教室";

        student one = new student("ty",10);
        System.out.println("one的名字:" + one.getName());
        System.out.println("one的年龄:" + one.getAge());
        System.out.println("one的教室:" + student.classRoom);

        student two = new student("tx",10);
        System.out.println("two的名字:" + two.getName());
        System.out.println("two的年龄:" + two.getAge());
        System.out.println("two的教室:" + student.classRoom);
    }
}

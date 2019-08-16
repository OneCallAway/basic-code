package Demo02;
import Demo02.Student;

/**
 * @program: basic-code
 * @description: 使用学生类
 * @author: ty
 * @create: 2019-07-17 15:49
 *
 * 一个类并不能直接使用，需要根据类创建一个对象才能使用
 * 1：导包：指出要使用什么类和类的位置
 * import 包名称.类名称
 * import Demo02.Student
 * 2：创建,格式:
 * 类名称 对象名 = new 类名称()
 * Student stu = new Student();
 * 3：使用,分为二种情况：
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名(参数)
 * (想用谁，就用对象名+.+名称)
 *
 * 注意事项：如果成员变量没有进行赋值，会有一个默认值，规则和数组一样
 **/
public class Demo02Student {
    public static void main(String[] args) {
        //1:导包
        //2:创建
        Student stu = new Student();
        //3:使用
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0

        //改变对象当中成员变量数值内容
        stu.name = "ty";
        stu.age = 10;
        System.out.println(stu.name);//ty
        System.out.println(stu.age);//10

        System.out.println("++++++++++++++++++++++++++++++");
        stu.eat();
        stu.sleep();
        stu.study();
    }
}

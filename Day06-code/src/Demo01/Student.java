package Demo01;

/**
 * @program: basic-code
 * @description: 学生类
 * @author: ty
 * @create: 2019-07-17 15:40
 *
 * 定义一个类，用来模仿学生事物，其中有二个组成部分
 * 属性（包括那些）：
 * 姓名
 * 年龄
 * 行为（可以做什么）：
 * 吃饭
 * 睡觉
 * 学习
 *
 * 对应到Java的类中：
 * 成员变量（属性）：
 *      数据类型 变量名称
 *      String name:
 *      int age;
 * 成员方法（行为）：
 *      public void eat(){}
 *      public void sleep(){}
 *      public void study(){}
 *
 * 注意事项：
 * 成员变成是直接定义在类当中，在方法外面
 * 成员方法不需要写static关键字
 **/
public class Student {
    //成员变量
    String name;
    int age;
    //成员方法
    public void eat(){
        System.out.println("吃饭");
        return;
    }
    public void sleep(){
        System.out.println("睡觉");
        return;
    }
    public void study(){
        System.out.println("学习");
        return;
    }
}

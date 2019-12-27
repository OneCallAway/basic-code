package Demo05;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-22 17:01
 *
 * 构造方法时专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
 * public 类名称（参数类型 参数名称）｛
 *  方法体
 * ｝
 *
 * 1：构造方法的名称必须和所在的类名称完全一致，就连大小写也要一样
 * 2：构造方法不要写返回值类型，void也不写
 * 3：构造方法不能return一个具体的返回值
 * 4：如果没有编写任何构造方法，那么编译器会默认赠送一个构造方法，没有参数，方法体什么事情都不会做
 * public Student(){}
 *5：一旦编写了至少一个构造方法，编译器便不在赠送
 *6：
 **/
public class Student {

    private String name;
    private int age;

    //无参数构造方法
    public Student(){
        System.out.println("无参数构造方法");
    }

    //有参数构造方法
    public Student(String name,int age){
        System.out.println("有参数构造方法");
        this.name = name;
        this.age = age;
    }

    public void setName(String 嗯嗯){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

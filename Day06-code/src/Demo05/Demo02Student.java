package Demo05;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-22 17:03
 **/
public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("++++++++++++++++++++++++++++++");
        Student stu2 = new Student("ty",20);
        System.out.println("name," + stu2.getName() + "age," + stu2.getAge());

        //如果需要改变对象当中的成员变量数据，依然需要使用set方法
        stu2.setAge(22);
        System.out.println("name," + stu2.getName() + "age," + stu2.getAge());

    }
}

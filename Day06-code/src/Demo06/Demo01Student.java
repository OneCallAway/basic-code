package Demo06;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-26 16:14
 **/
public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("ty");
        stu1.setAge(11);
        System.out.println(stu1.getName() + stu1.getAge());

        Student stu2 = new Student("xsf",22);
        System.out.println(stu2.getName() + stu2.getAge());

        stu2.setAge(23);
        System.out.println(stu2.getName() + stu2.getAge());
    }
}

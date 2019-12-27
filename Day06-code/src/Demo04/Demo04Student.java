package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-19 19:26
 **/
public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("ty");
        stu.setAge(11);
        stu.setSex(true);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.isSex());


    }
}

package Demo03;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-11 07:59
 * 如果一个成员变量使用了static关键字，那么这个变量不在属于对象自己，而是属于所在的类，多个对象共享同一份数据
 **/
public class Demo01StaticField {
    public static void main(String[] args) {

        student one = new student("ty",10);
        one.classRoom = "111";
        System.out.println("姓名:" + one.getName() + "年龄:" + one.getAge() +
                            "教室:" + one.classRoom + "学号:" + one.getId());
        student two = new student("xsf",11);
        System.out.println("姓名:" + two.getName() + "年龄:" + two.getAge() +
                "教室:" + two.classRoom + "学号:" + two.getId());
    }
}

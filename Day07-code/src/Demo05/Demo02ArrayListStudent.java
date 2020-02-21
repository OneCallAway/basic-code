package Demo05;

import java.util.ArrayList;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-01-13 09:30
 *
 * 自定义4个学生对象，添加到集合，并且遍历
 * 1:自定义Student学生类，四个部分
 * 2:创建一个集合，用来存储学生对象
 * 3:根据类创建4个学生对象并且赋值
 * 4:将4个学生对象添加到集合中
 * 5:遍历集合
 **/
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("qw",10);
        Student two = new Student("qwe",11);
        Student three = new Student("qwr",12);

        list.add(one);
        list.add(two);
        list.add(three);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名" + stu.getName() + "年龄" + stu.getAge());
        }
    }
}

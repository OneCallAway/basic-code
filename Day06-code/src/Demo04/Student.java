package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-19 19:22
 *
 * 对于基本类型中的boolean中getter方法要写成isXxx，setter方法不变
 **/
public class Student {
    private String name;
    private int age;
    private boolean sex;

    public void setSex(boolean sex){
        this.sex = sex;
    }

    public boolean isSex(){
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

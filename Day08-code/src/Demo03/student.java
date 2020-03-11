package Demo03;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-12 05:44
 **/
public class student {
    private String name;
    private int age;
    private int id;
    static String classRoom;
    private static int idCounter = 0;

    public student() {
        this.id = ++idCounter;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

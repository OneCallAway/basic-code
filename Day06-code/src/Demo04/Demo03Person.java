package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-19 16:38
 **/
public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "Ty";
        person.setAge(20);
        person.show();
    }
}

package Demo03;
import Demo03.Phone;

/**
 * @program: basic-code
 * @description: 对象
 * @author: ty
 * @create: 2019-07-17 16:05
 **/
public class Demo03PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.color = "白色";
        one.price = 5000;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        System.out.println("++++++++++++++++++");
        one.call("ty");
        one.sedMessage();
        System.out.println("++++++++++++++++++++");

        Phone two = new Phone();
        two.brand = "三星";
        two.color = "白色";
        two.price = 5000;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);

        System.out.println("++++++++++++++++++");
        two.call("xsf");
        two.sedMessage();
        System.out.println("++++++++++++++++++++");
    }
}

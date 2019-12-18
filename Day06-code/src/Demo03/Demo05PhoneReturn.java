package Demo03;

/**
 * @program: basic-code
 * @description: 自定义类作为返回值
 * @author: ty
 * @create: 2019-12-18 17:57
 * 当使用一个对象类型（类）作为方法的返回值时，返回值其实就是对象的地址值。
 **/
public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "ad";
        one.price = 1111;
        one.color = "heise";
        return one;
    }
}

package Demo03;

/**
 * @program: basic-code
 * @description: 参数
 * @author: ty
 * @create: 2019-12-18 16:05
 * 当一个对象作为参数传递到方法中时，实际上传递进去的是对象的地址值。
 **/
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "pg";
        one.price = 222;
        one.color = "hei";

        method(one); //传递进去的参数就是地址值
    }

    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}

package Demo03;

/**
 * @program: basic-code
 * @description: 手机类
 * @author: ty
 * @create: 2019-07-17 16:01
 **/
public class Phone {
    String brand;//品牌
    int price;
    String color;

    public void call(String who){
        System.out.println("给" + who + "打电话");
        return;
    }
    public void sedMessage(){
        System.out.println("发短信");
        return;
    }
}

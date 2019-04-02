package Sequence;

/**
 * @program: OneM
 * @description: 死循环
 * @author: ty
 * @create: 2019-03-28 14:29
 *
 * 永远停不下来的循环，死循环
 *
 * 死循环的标准格式：
 * while(true){
 *     循环体
 * }
 **/
public class Demo16DeadLoop {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//        }

        while(true){
            System.out.println("aaaa");
        }
//        System.out.println("Hello"); 前面有死循环，后面的输出语句就会报错
    }
}

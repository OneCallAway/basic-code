package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-04-03 01:48
 *
 * 要求：打印指定次数的helloworld
 **/
public class Demo03MethodPrint {
    public static void main(String[] args) {
        getPrint(10);//没有返回值只能用单独调用
    }

    /*
    三要素：
    返回值类型：void
    方法名称：getPrint
    参数列表：int num, 打印次数
     */
    public static void getPrint(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World");
        }
    }
}

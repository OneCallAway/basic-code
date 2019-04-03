package Demo01;

/**
 * @program: basic-code
 * @description: 参数
 * @author: ty
 * @create: 2019-04-03 00:59
 *
 * 有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数
 * ps：二个数字相加，必须知道二个数字是各自多少，才能相加
 *
 * 无参数：小括号当中留空，一个方法不需要任何数据条件，自己就能独自完成任务，就是无参数。
 * ps：定义一个方法，打印固定十次HelloWorld
 *
 *
 * 有返回值方法调用过程：
 * 1：方法调用：调用sum方法
 * 2：参数传递：将调用的sum方法a和b赋值
 * 3：执行方法体：计算result
 * 4：带着返回值回到方法的调用处：return result 到 sum调用处
 * 注意事项：对于有返回值的方法，可以使用单独调用、打印调用或者赋值调用
 *
 * 无返回值方法调用过程：
 * 1：方法调用：调用sum方法
 * 2：参数传递：将调用的sum方法a和b赋值
 * 3：执行方法体：计算result
 * 4：直接结束方法，不用返回到调用处
 * 注意事项：无返回值的方法，只能使用单独调用
 **/
public class Demo03MethodParam {
    public static void main(String[] args) {
//        int num = method1(10,20);
//        System.out.println(num);
        method1(10,20);
        System.out.println("++++++++++++++++++++");
        method2();
//        System.out.println(method2());无返回值不能使用打印调用，因为没有值可以输出
//        int num2 = method2(10，20);  == int num2 = void;  无返回值不能使用赋值调用，因为是一个void


    }

    //二个数字相乘，做乘法，必须知道二个数字各自是多少，否则无法计算
    //有参数
//    public static int method1(int a, int b){
//        int retsult = a * b;
//        return retsult;
//    }
    public static void method1(int a, int b){
        int result = a * b;
        System.out.println(result);
    }

    //例如打印输出固定十次文本字符串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }
}

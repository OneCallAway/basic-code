package Demo01;

/**
 * @program: basic-code
 * @description: 返回值
 * @author: ty
 * @create: 2019-04-03 01:05
 **/
public class Demo04MethodReturn {
    //定义一个方法，用来求出二个数字之和,有返回值类型
    public static void main(String[] args) {
        //main方法调用
        int num = add1(10,20);
        System.out.println(num);

        System.out.println("+++++++++++++++++++");
        //void方法，无返回值类型，只在方法体中显示结果
        add2(10,20);
    }

    public static int add1(int a, int b){
        int result = a + b;
        return result;
    }

    public static void add2(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

}

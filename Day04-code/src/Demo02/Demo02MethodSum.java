package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-04-03 01:41
 *
 * 要求：定义一个方法，求出1-100之间所有数字的和
 **/
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是：" + getSum());//打印调用
        System.out.println("+++++++++++++++");
        int sum = getSum();//赋值调用
        System.out.println(sum);
        System.out.println("++++++++++++");
        getSum();//单独调用
    }

    /*
    三要素：
    返回值：有返回值 int类型 结果为int数字
    方法名称：getSum
    参数列表：数据范围确定1-100，所以不需要任何条件
     */
    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
//        System.out.println(sum);单独调用
        return sum;
    }
}

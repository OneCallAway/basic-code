package Demo01;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-03-28 18:09
 * <p>
 * 方法其实就是若干语句的功能集合。
 * <p>
 * 方法好比是一个工厂。
 * 蒙牛工厂     原料：奶牛，饲料，水
 * 产出物：奶制品
 * 钢铁工厂    原料：铁矿石，煤炭
 * 产出物：钢铁建材
 * <p>
 * 参数(原料)：进入方法的数据
 * 返回值(产出物)：从方法中出来的数据
 * <p>
 * 定义方法的完整格式：
 * 修饰符 返回值类型 方法名称(参数类型 参数名称，........参数类型 参数名称//可以多个参数类型和名称){
 * 方法体
 * return 返回值;
 * }
 * <p>
 * 修饰符:现阶段固定写法， public static
 * 返回值类型:方法最终产生的数据结果是什么类型
 * 方法名称:方法的名字，驼峰命名
 * 参数类型:进入方法的数据是什么类型
 * 参数名称:进入方法的数据对应的变量名称
 * ps：参数如果有多个使用逗号进行分隔
 * <p>
 * 方法体：方法要坐的事情
 * return：二个作用，第一停止当前方法，第二将后面的结果数据返回值还给调用处
 * 返回值：方法执行后最终产生的数据结果
 * <p>
 * return后面的返回值，必须和方法名称前面的"返回值类型"保持对应.
 *
 * 方法的三种调用格式：
 * 1：单独调用：方法名称（参数）
 * 2：打印调用:System.out.println(方法名称（参数）);
 * 3：赋值调用:数据类型 变量名称 = 方法名称（参数);
 *
 * 注意：之前学习的方法，返回值类型固定写为void，这种方法只能够单独调用，不能进行打印调用或者赋值调用。
 **/
public class Demo01MethodDefine {
    public static void main(String[] args) {
        //单独调用
        add(2,3);
        System.out.println("+++++++++++++++++++++++++++");

        //打印调用
        System.out.println(add(2,3));
        System.out.println("++++++++++++++++++++++");

        //赋值调用
        int number = add(12,32);
        number += 100;
        System.out.println(number);
    }

    private static int add(int i, int j) {
        System.out.println("方法执行");
        int sum = i + j;
        return sum;
    }


}

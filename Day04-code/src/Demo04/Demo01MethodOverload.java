package Demo04;

/**
 * @program: basic-code
 * @description: 重载
 * @author: ty
 * @create: 2019-04-03 02:02
 *
 * 对于功能类似的方法来说，对于参数列表不一样，却需要记住那么多不同的方法名称，太麻烦method1,method2......
 *
 * 方法重载（Overload）：多个方法的名称一样，但是参数列表不一样
 * 好处：只需要记住唯一一个方法名称，就可以实现多个类似的功能
 *
 * 方法重载与下列因素相关:
 * 1：参数个数不同（二个参数，三个参数。。。）
 * 2：参数类型不同
 * 3：参数的多类型顺序不同
 *
 * 方法重载与下列因素无关：
 * 1：与参数名称无关 （int a, int b） (int x,int j)与参数名称无关，会产生冲突
 * 2: 与方法的返回值类型无关
 **/
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));//二个参数
        System.out.println(sum(10,20,30));//三个参数
//        System.out.println(sum(10,20,30,40));//没有四个参数的方法所以报错
    }

    public static int sum(int a,double b){
        return (int)(a + b);//参数的多类型顺序不同
    }
    public static int sum(double a,int b){
        return (int)(a + b);//参数的多类型顺序不同
    }

    public static int sum(double a,double b){
        return (int)(a + b);//参数类型不同
    }

    public static int sum(int a,int b){
        System.out.println("有二个参数方法执行");
        return a + b;
    }

    //错误写法，与参数名称无关，不能进行方法重载，同样是二个参数不知道赋值给谁
    /*public static int sum(int x,int y){
        System.out.println("有二个参数方法执行");
        return x + y;
    }*/

    //错误写法，与方法的返回值类型无关  int + int = int 而不是double
    /*public static double sum(int a,int b){
        System.out.println("有二个参数方法执行");
        return a + b;
    }*/

    public static int sum(int a,int b,int c){
        System.out.println("有三个参数方法执行");
        return a + b + c;
    }
}

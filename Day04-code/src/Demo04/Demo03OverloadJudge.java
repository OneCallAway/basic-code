package Demo04;

/**
 * @program: basic-code
 * @description: 判断是否是重载
 * @author: ty
 * @create: 2019-04-03 02:33
 **/
public class Demo03OverloadJudge {
    public static void open(){} //正确重载
    public static void open(int a){} //正确重载
//    static void open(int a,int b){} //错误重载与第八行冲突  与参数名称无关
    public static void open(double a,int b){} //正确重载
//    public static void open(int a,double b){} //错误重载与第六行冲突 与参数名称无关
//    public void open(int i,double b){} //错误重载，与第五行冲突 与参数名称无关
    public static void OPEN(){} //代码不会报错，但不是有效的重载
    public static void open(int i,int j){}//错误重载，与第三行冲突
}

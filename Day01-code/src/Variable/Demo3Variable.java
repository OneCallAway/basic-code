
package Variable;
/**
 * @program: OneM
 * @description: 变量
 * @author: ty
 * @create: 2018-12-03 05:00
 * 变量：程序运行期间，内容可以发生改变的量。
 **/
public class Demo3Variable {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);

        //变化
        i =2;
        System.out.println(i);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        byte num1 = 30;
        System.out.println(num1);
        //byte num2 = 400; 超过数据范围
        //System.out.println(num2);

        short num3 = 30;
        System.out.println(num3);

        long num4 = 1000000000000L;//不加L会默认为int类型，会超出范围
        System.out.println(num4);

        float num5 = 2.5F;//浮点数默认为double类型，用float需要加后缀f
        System.out.println(num5);

        double num6 = 1.2;
        System.out.println(num6);

        char zhifu = 'A';
        System.out.println(zhifu);

        char zhifu1 ='中'; //字符型
        System.out.println(zhifu1);

        String zxc = "asdad"; //字符串
        System.out.println(zxc);

        boolean var1 = true;
        System.out.println(var1);

        var1 = false;
        System.out.println(var1);

        boolean var2 = var1;//赋值
        System.out.println(var2);


    }
}

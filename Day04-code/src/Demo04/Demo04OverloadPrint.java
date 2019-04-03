package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-04-03 02:40
 *
 * 在调用输出语句的时候，println方法其实就是进行了多种数据类型的方法重载
 **/
public class Demo04OverloadPrint {
    public static void myPrint(byte num){
        System.out.println(num);
    }

    public static void myPrint(short num){
        System.out.println(num);
    }

    public static void myPrint(int num){
        System.out.println(num);
    }

    public static void myPrint(long num){
        System.out.println(num);
    }

    public static void myPrint(float num){
        System.out.println(num);
    }

    public static void myPrint(double num){
        System.out.println(num);
    }

    public static void myPrint(char zifu){
        System.out.println(zifu);
    }

    public static void myPrint(boolean is){
        System.out.println(is);
    }
    
    public static void myPrint(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        myPrint(100);
        myPrint("hello");
        myPrint((byte)10);
        myPrint(10.0);
    }
}

package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-04-03 02:18
 *
 * 比较二个数据是否相等。
 * 参数类型分别为二个byte类型，二个short类型，二个int类型，二个long类型
 * 并在main方法中进行测试
 **/
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println("+++++++++++++");

        System.out.println(isSame((short)10,(short)20));
        System.out.println(isSame(20,20));//如果不强转short会自定义为int类型
        System.out.println("+++++++++++++++++");

        System.out.println(isSame(10,20));
        System.out.println("++++++++++++++++++");

        System.out.println(isSame(10L,20L));
    }

    public static boolean isSame(byte a,byte b){
        System.out.println("二个byte");
        boolean same;
        if(a == b){
            same = true;
        }else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        System.out.println("二个short");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a,int b){
        System.out.println("二个int");
        return a == b;//最简单
    }

    public static boolean isSame(long a,long b){
        System.out.println("二个long");
        if(a == b){
            return true;
        }else {
            return false;
        }
    }
}

package Demo01;

/**
 * @program: basic-code
 * @description:  方法
 * @author: ty
 * @create: 2019-03-28 18:02
 *
 * 方法的定义格式：
 * public static void 方法名称（）｛
 *          方法体;
 * ｝
 *调用格式:
 * 方法名称（）;
 *
 * 注意事项：
 * 1：方法定义的先后顺序无所谓
 * 2：方法定义必须是挨着的，不能再一个方法内部定义另一个方法
 * 3：方法定义之后，自己不会执行的，如果希望执行，需要进行调用
 **/
public class Demo01Method {
    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printMethod();
    }
}

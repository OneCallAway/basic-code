package Demo01;

/**
 * @program: basic-code
 * @description: 动态数组
 * @author: ty
 * @create: 2019-04-09 02:14
 * 使用动态初始化数组，其中的元素将会自动拥有默认值，规则如下：
 * 如果是整数类型。那么默认为0
 * 如果是浮点类型，那么默认为0.0
 * 如果是字符类型，那么默认为“|u0000”
 * 如果是布尔类型，那么默认为false
 * 如果是引用类型，那么默认为nul当中l
 *
 * 注意事项：
 * 静态初始化也有默认值得过程，不过系统马上将默认值替换成大括号当中的具体数值
 **/
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        //将10赋值给数组array当中的1号元素
        array[1] = 10;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}

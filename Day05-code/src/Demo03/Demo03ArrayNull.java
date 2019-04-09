package Demo03;

/**
 * @program: basic-code
 * @description: 空指针异常
 * @author: ty
 * @create: 2019-04-09 14:37
 *
 * 所有的引用变量都可以赋值为一个null值，但是代表其中什么都没有
 *
 * 数组必须进行new初始化才能使用其中的元素
 * 如果只是赋值了一个null，没有进行new创建
 * 那么会发生空指针异常：Exception in thread "main" java.lang.NullPointerException
 **/
public class Demo03ArrayNull {
    public static void main(String[] args) {
        int[] array = null;


//        array = new int[3];
        System.out.println(array[0]);
    }
}

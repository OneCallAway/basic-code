package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-11 03:32
 * 定义一个方法，把数组｛1,2,3｝按照指定格式拼接成一个字符串，格式如下[world1#world2#world3]
 * <p>
 * 1:首先准备一个int[]数组，内容是1,2,3
 * 2:定义一个方法，用来将数组变成字符串
 * 返回值类型:String
 * 方法名称:fromArrayToString
 * 参数列表:int[]
 * 3:格式:[world1#world2#world3]
 * 4:调用方法，得到返回值，打印结果字符串
 **/
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "world" + array[i] + "]";
            } else {
                str += "world" + array[i] + "#";
            }
        }
        return str;
    }
}

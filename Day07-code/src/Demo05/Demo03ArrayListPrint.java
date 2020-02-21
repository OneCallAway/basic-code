package Demo05;

import java.util.ArrayList;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-01-13 09:35
 * 定义以指定格式打印集合的方法（ArrayList类型作为参数），使用｛｝扩起集合，使用@分隔每个元素
 * 格式参照｛元素@元素@元素｝。
 * System.out.println(list);    [10,20,30]
 * printArrayList(list);        {10@20@30}
 **/
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qw");
        list.add("qwe");
        list.add("qwr");
        System.out.println(list);
        printArrayList(list);
    }
    /*
    定义方法三要素
    返回值类型:只是打印，没有运算，没有结果，用void
    方法名称:printArrayList
    参数列表:ArrayList
     */
    private static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size() - 1){
                System.out.println(name + "}");
            }else {
            System.out.print(name + "@");
            }
        }
    }
}

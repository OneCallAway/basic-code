package Demo04;

import java.util.ArrayList;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-29 12:27
 *
 * 数组的长度不可以发生改变，但是ArrayList集合的长度可以发生改变
 *
 * 对于ArrayList来说，有一个尖括号<E>代表泛型
 * 泛型：也就是装在集合当中的所有元素，全都是统一的类型
 * 泛型只能是引用类型，不能是基本类型
 *
 * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
 * 如果内容是空，得到的是空的空括号
 **/
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，装的全部是String字符串类型的数据
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //添加数据
        list.add("Ty");
        System.out.println(list);
    }

}

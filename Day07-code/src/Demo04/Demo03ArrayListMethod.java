package Demo04;

import java.util.ArrayList;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-29 12:39
 * ArrayList当中常用方法有：
 * public boolean add(E e)  向集合当中添加元素，参数的类型和泛型一致，返回值代表添加是否成功
 * 对于ArrayList来说，add添加动作一定是成功的，所以返回值可用可不用
 * 对于其他集合来说，add添加动作不一定成功
 * public E get(int index)  从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
 * public E remove(int index)  从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素
 * public int size()        获取集合的尺寸长度，返回值是集合中包含的元素个数
 **/
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //添加元素:add
        boolean success = list.add("ty");
        System.out.println(list);
        System.out.println(success);

        list.add("asd");
        list.add("asd2");
        list.add("asd3");
        System.out.println(list);

        //从集合中获取元素：get，索引值从0开始
        String name = list.get(0);
        System.out.println(name);

        //从集合中删除元素:remove
        String whoRemove = list.remove(2);
        System.out.println(whoRemove);
        System.out.println(list);

        //获取集合长度，也就是其中元素个数
        int size = list.size();
        System.out.println(size);


    }
}

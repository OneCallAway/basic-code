package Demo01;

import java.util.Arrays;

/**
 * @program: basic-code
 * @description: 面向对象
 * @author: ty
 * @create: 2019-06-19 13:30
 *
 * 面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节。
 * 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来处理事情
 **/
public class Demo01PrintArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        //要求打印格式为：[10,20,30,40,50]
        //使用面向过程，每一个步骤细节都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){//如果是最后一个元素
                System.out.println(array[i] + "]");
            }else {
                System.out.print(array[i] + " ,");
            }
        }
        System.out.println("+++++++++++++++++++++++");
        //使用面向对象
        //找一个JDK提供好的Arrays类
        //使用toString方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));

    }
}

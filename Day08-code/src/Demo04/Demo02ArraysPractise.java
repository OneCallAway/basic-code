package Demo04;

import java.util.Arrays;
import java.util.Collections;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-12 07:14
 **/
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "87562175432";

        //升序排列
        //必须是数组才可以用Arrays.sort方法
        //String --> 数组 用toCharArray()
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        System.out.println("=========");

        
        //倒序排序
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}

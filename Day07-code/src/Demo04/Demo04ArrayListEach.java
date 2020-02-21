package Demo04;

import java.util.ArrayList;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-01-13 08:55
 **/
public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("1234");
        list.add("1235");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

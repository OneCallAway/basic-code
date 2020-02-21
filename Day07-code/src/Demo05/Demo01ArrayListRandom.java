package Demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-01-13 09:05
 *
 * 生成6个1～33之间的随机整数，添加到集合，并遍历集合
 * 1:需要存储６个数字，创建一个集合
 * 2:产生随机数
 * 3:循环６次，来产生六个随机数
 * 4:循环内调用ｒ.nextInt(int n),参数是33，0~32，整体+1才是1~33
 * 5:把数字添加到集合中
 * 6:遍历集合
 **/
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

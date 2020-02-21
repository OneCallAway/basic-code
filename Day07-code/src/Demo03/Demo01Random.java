package Demo03;

import java.util.Random;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-27 22:15
 *
 * Random类用来生成随机数字
 * 使用步骤：
 * 1：导包
 * import java.util.Random
 * 2：创建
 * Random r = new Random()
 * 3：使用
 * 获取一个随机的数字(范围是int的是所有范围，正负二种)，int num = r.nextInt()
 * 获取一个随机的int数字（参数代表了范围，左闭右开区间），int num = r.rextInt(3)
 * 实际上含义是：[0,3),也就是0~2
 **/
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println(num);
    }
}

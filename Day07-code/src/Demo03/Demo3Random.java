package Demo03;

import java.util.Random;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-28 15:06
 *
 * 根据int变量n的值，来获取随机数字，范围是[1,n],也可以取到1也可以取到n
 **/
public class Demo3Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);

        }
    }
}

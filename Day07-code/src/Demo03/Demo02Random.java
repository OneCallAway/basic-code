package Demo03;

import java.util.Random;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-28 15:04
 **/
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);//实际上是0~9
            System.out.println(num);

        }
    }
}

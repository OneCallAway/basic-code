package Demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-28 15:44
 **/
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;//(1~100)
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("输入猜测的数字");
            int num = s.nextInt();
            if(num > randomNum){
                System.out.println("太大了");
            }else if(num < randomNum){
                System.out.println("太小了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("结束");
    }
}

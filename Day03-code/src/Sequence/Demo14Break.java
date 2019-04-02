package Sequence;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2019-03-23 15:27
 *
 * break关键字的用法：
 * 1：可以用在switch语句当中，一旦执行，整个switch语句立刻结束
 * 2：还可以用在循环语句中，一旦执行，整个循环语句立刻结束，打断循环
 *
 * 凡是次数确定的场景多用for循环，否则多用while循环
 **/
public class Demo14Break {
    public static void main(String[] args) {
//        for (int i = 0; i < 10 ; i++) {
//            if (i == 3){
//                break;
//            }
//            System.out.println("A" + i);
//        }

        int i = 0;
        while(i < 10){
            if (i == 3){
                break;
            }
            System.out.println("A" + i);
            i++;
        }
    }
}

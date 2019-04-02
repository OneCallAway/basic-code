package Sequence;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2019-03-28 14:52
 **/
public class Demo17LoopHourAndMinute {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {//外层控制小时
            for (int j = 0; j < 60; j++) {//内层控制小时之内的分钟
                System.out.println(i + "时" + j + "分");
            }
        }
    }
}

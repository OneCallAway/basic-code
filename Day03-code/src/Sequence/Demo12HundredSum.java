package Sequence;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2019-03-23 15:05
 *
 * 求1-100之间的偶数和
 **/
public class Demo12HundredSum {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println("sum" + sum);
//        System.out.println("++++++++++++++++++");
//
//        int sum = 0;
//        int j = 1;
//        while(j <= 100 && j % 2 == 0){
//            sum += j;
//            j ++;
//        }
//        System.out.println("sum" + sum);
//        System.out.println("++++++++++++++++++");

        int sum = 0;
        int x = 1;
        do{
            if (x % 2 == 0){
                sum += x;
            }
            x ++;
        }while (x <= 100);
        System.out.println("sum" + sum);


    }

}

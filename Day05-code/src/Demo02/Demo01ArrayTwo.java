package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-04-09 02:34
 *
 * 栈，堆，方法区
 **/
public class Demo01ArrayTwo {
    public static void main(String[] args) {
        //动态初始化
        //动态初始化
        int[] arrayA = new int[3];
        System.out.println(arrayA);//地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0

        //改变数组元素当中的内容
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//20
        System.out.println("+++++++++++++++++++++++++");
        int[] arrayB = new int[3];
        System.out.println(arrayB);//地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//0
        System.out.println(arrayB[2]);//0

        //改变数组元素当中的内容
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200

    }
}

package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-04-09 02:34
 *
 * 栈，堆，方法区
 **/
public class Demo01ArraySame {
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
        int[] arrayB = arrayA; //将arrayA数组的地址值，赋值给arrayB数组，相当于B数组后赋值的数会覆盖A数组所对应的堆中的数值
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

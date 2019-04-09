package Demo03;

/**
 * @program: basic-code
 * @description: 获取数组长度
 * @author: ty
 * @create: 2019-04-09 15:04
 *
 * 如何获取数组长度
 * 数组名称.length
 * 会得到一个int数字，代表数组长度
 *
 * 数组一旦创建，程序运行期间长度不可改变
 *
 **/
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {1,2,3};
        int len = arrayB.length;
        System.out.println("arrayB数组长度是:" + len);
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        int[] arrayC = new int[3];
        arrayC[0] = 1;
        arrayC[1] = 2;
        arrayC[2] = 3;
        System.out.println(arrayC[0]);
        System.out.println(arrayC[1]);
        System.out.println(arrayC[2]);
        System.out.println(arrayC.length);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
/*
int[] arrayC = new int[3]; 定义了一个长度为3的数组
arrayC = new int[5];重新new了一个长度为5的数组
原长度为3的数组不发生变成，长度为5的数组是重新构造的一个，等于在堆中存在二个地址不同长度不同的数组，但是在栈中只有一个arrayC
虽然arrayC地址发生覆盖，但是在堆中数组长度不变。
数组一旦创建，程序运行期间长度不可改变。
* */
        arrayC = new int[5];
        arrayC[0] = 2;
        arrayC[1] = 3;
        arrayC[2] = 4;
        System.out.println(arrayC[0]);
        System.out.println(arrayC[1]);
        System.out.println(arrayC[2]);
        System.out.println(arrayC.length);

    }
}

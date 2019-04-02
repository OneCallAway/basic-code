package Sequence;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2019-03-17 15:49
 * 使用三元运算符和标准的if-else语句分别实现：取二个数字当中的最大值
 **/
public class Demo06Max {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //三元运算符
        int max = a > b ? a : b;
        System.out.println("最大值：" + max);

        //if语句
        int max1;
        if (a>b){
            max1 = a;
        }else {
            max1 = b;
        }
        System.out.println(max1);
    }

}

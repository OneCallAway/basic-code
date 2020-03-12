package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-12 07:46
 *
 *计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有几个
 *
 * 1:使用for循环
 * 2:起点位置-10.8，转换成-10
 *  2.1 可以使用Math.ceil方法，向上取整
 *  2.2 强制转换成int类型，自动舍弃小数位
 * 3:每一个数字都是整数，所以步进表达式因为是num++，这样每次都是+1
 * 4:拿绝对值使用Math.abs方法
 * 5:一旦发现一个数字，就使用计数器count++进行统计
 **/
public class Demo04MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;

//        for (int j = Math.ceil(min); i < max; i++),使用Math.ceil向上取整
        for (int i = (int) min; i < max; i++){ //强转(int)min
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);

    }
}

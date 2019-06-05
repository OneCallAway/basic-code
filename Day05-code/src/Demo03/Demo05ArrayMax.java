package Demo03;

/**
 * @program: basic-code
 * @description: 求数组当中的最大值
 * @author: ty
 * @create: 2019-05-14 00:43
 **/
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,10,15,30,50};

        int max = array[0];//作比较的值
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比max值更大，替换max值
            if(array[i] > max){
                max = array[i];
            }
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比min值更小，替换min值
            if(array[i] < min){
                min = array[i];
            }

        }
        //谁的值最大就存在max中
        System.out.println(max);
        //最小值存在min中
        System.out.println(min);
    }
}

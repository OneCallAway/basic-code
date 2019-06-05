package Demo04;

/**
 * @program: basic-code
 * @description: 数组作为方法参数
 * @author: ty
 * @create: 2019-06-05 19:57
 *
 * 数组可以作为方法的参数
 * 当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值
 **/
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        System.out.println(array);//地址值
        printArray(array); //传递进去的就是array当中的地址值
        printArray(array);
        printArray(array);
    }

    /*
    方法三要素：
    返回值类型：只是进行打印操作，不需要计算。没有结果用void
    方法名称：printArray
    参数列表：前提是有数组才可以打印 int[] array
     */

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("printArray方法收到的参数是:");
            System.out.println(array);
            System.out.println(array[i]);

        }
    }

}

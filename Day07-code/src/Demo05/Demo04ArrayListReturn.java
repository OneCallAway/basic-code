package Demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-01-13 11:46
 * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
 * 1：需要创建一个集合，用来存储int数字
 * 2：随机数字就用Random nextInt
 * 3：循环20次，把随机数字放入大集合
 * 4：自定义一个方法，用来筛选：根据大集合，筛选符合要求的元素，得到小元素
 * 返回值类型：ArrayList小
 * 方法名称：getSmallList
 * 参数列表：ArrayList大(20)
 * 5:判断是偶数：num%2 == 0
 * 6：如果是偶数就放入小集合中
 **/
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;//1-100
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    //接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        //创建一个小集合
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}

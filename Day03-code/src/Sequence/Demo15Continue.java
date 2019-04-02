package Sequence;

/**
 * @program: OneM
 * @description:
 * @author: ty
 * @create: 2019-03-28 13:26
 *
 * 另一种循环控制语句是continue关键字
 * 一旦执行，立刻跳出当前次循环剩余内容，马上开始下一次循环
 **/
public class Demo15Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 4){//如果当前是第四层
                continue;//就跳过当前循环，马上开始下一次，范围小
                //break;  结束所有的循环就没有4以后的循环了，范围大
            }
            System.out.println(i + "层到了");
        }
    }

}

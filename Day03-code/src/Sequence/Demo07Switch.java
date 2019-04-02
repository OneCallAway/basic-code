package Sequence;

/**
 * @program: OneM
 * @description: switch语句标准格式
 * @author: ty
 * @create: 2019-03-23 12:35
 **/
public class Demo07Switch {
    public static void main(String[] args) {
        int num = 1;

        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("数据不合理");
                break;
        }
    }
}

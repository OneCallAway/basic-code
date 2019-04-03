package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-04-03 01:34
 *
 * 要求：
 * 定义一个方法，用来判断二个数字是否相同  booble类型
 **/
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
    }

    /*
    方法三要素：
    返回值类型：boolean
    方法名称：isSame
    参数列表：int a, int b
     */
    public static boolean isSame(int a,int b){
        boolean same;
//方法一：
       /* if(a == b){
            same = true;
        } else {
            same = false;
        }*/
//方法二：
//       same = a == b ? true : false;

//方法三：
//       same = a == b;
        return a == b;
    }
}

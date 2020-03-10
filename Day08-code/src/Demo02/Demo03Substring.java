package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-10 15:44
 * 字符串的截取方法
 *
 * public String substring(int index) 截取从参数位置一直到字符串末尾，返回新的支付查
 * public String substring(int begin,int end) 截取从begin开始，一直到end结束，中间的字符串
 * [begin,end),左闭右开，包含左边不包含右边
 **/
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.substring(2);
        System.out.println(str2);

        String str3 = str1.substring(1,3);
        System.out.println(str3);

        //字符串的内容不会发生改变，改变的是字符串的地址值
        String strA = "hello";//0x233
        System.out.println(strA);
        strA = "java";//0x122
        System.out.println(strA);
    }
}

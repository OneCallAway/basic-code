package Demo01;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-02-21 11:40
 *
 * 字符串常量池，程序当中直接写上双引号字符串，就在字符串常量池中
 * 对于基本类型来说，==是进行数组的比较
 *1:对于引用类型来说，==进行的是地址值的比较
 *2:双引号直接写打的字符串在常量池当中，new的不在池当中
 **/
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        //比较的地址值不一样，“”在字符串常量池中，new的不在里面
        System.out.println(str1 == str2);//T
        System.out.println(str1 == str3);//F
        System.out.println(str2 == str3);//F
    }
}

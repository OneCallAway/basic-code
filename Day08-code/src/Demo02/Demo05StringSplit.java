package Demo02;

/**
 * @program: basic-code
 * @description: 分割字符串
 * @author: ty
 * @create: 2020-03-11 03:22
 * <p>
 * 分割字符串的方法
 * public String[] split(String regex) 按照参数的规则，将字符串切分成为若干部分
 * <p>
 * split方法的参数其实是一个正则表达式
 * 如果按照英文句点".",进行切分，必须写"\\.",进行切分
 **/
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "a,b,c";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("==================");

        String str2 = "a b c";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("==================");

        String str3 = "a.b.c";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}

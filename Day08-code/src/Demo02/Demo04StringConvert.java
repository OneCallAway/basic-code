package Demo02;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-10 15:58
 * String当中与转换相关的常用方法
 *
 * public char[] toCharArray() 将当前字符串拆分成为字符数组作为返回值
 * public byte[] getBytes() 获得当前字符串底层的字节数组
 * public String replace(CharSequence oldString,CharSequence new String)
 * 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
 * CharSequence 意思就是说可以接受字符串类型
 **/
public class Demo04StringConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //新老字符串的替换,替换敏感词汇之类(游戏内发言系统)。
        String str1 = "hoo ool ikko";
        String str2 = str1.replace("o", "1");
        System.out.println(str1);
        System.out.println(str2);
    }
}

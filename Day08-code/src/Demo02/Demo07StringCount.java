package Demo02;

import java.util.Scanner;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2020-03-11 07:21
 * 键盘输入一个字符串，并且统计其中各种字符出现的次数（大小写字母，数字，特殊符号）
 *
 * 1:Scanner 键盘输入
 * 2:键盘输入字符串 String str = sc.next()
 * 3:定义四个变量，分别代表四种字符出现的次数
 * 4:需要对字符串进行检查 String --> char,方法时toCharArray()
 * 5:遍历char[]字符数组,对当前字符的种类进行判断，并且进行++动作
 * 6:打印输出四个变量,分别代表四种字符出现的次数
 **/
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:");
        String input = sc.next();//获取键盘输入的字符串

        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countNumber = 0;//数组
        int countOther = 0;//其他字符

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];//当前单个字符,遍历
            if('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if('a' <= ch && ch <= 'z'){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母有：" + countUpper);
        System.out.println("小写字母有：" + countLower);
        System.out.println("数字有：" + countNumber);
        System.out.println("特殊符号有：" + countOther);

    }
}

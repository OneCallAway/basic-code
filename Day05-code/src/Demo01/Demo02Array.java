package Demo01;

/**
 * @program: basic-code
 * @description: 静态初始化
 * @author: ty
 * @create: 2019-04-03 20:22
 *
 * 动态初始化（指定长度）：在创建数组的时候，直接指定数组当中的数据元素个数
 * 静态初始化（指定内容）：在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定
 *
 * 静态初始化格式：
 * 数据类型 [] 数组名称 = new 数据类型[] ｛元素1，元素2，.....｝
 *
 * 注意事项：
 * 虽然静态初始化没有直接告诉长度，但是根据大括号里面的元素具体内容，也可以自动推算出长度
 **/
public class Demo02Array {
    public static void main(String[] args) {
        //创建一个数组，里面装的都是int数字，5，15，25
        int [] arrayA = new int[]{5,15,25};

        //创建一个数组，用来装字符串“hello，world，java”
        String [] arrayB = new String[]{"hello","world","java"};

    }
}

package Variable;

/**
 * @program: OneM
 * @description: 注意事项
 * @author: ty
 * @create: 2018-12-03 05:21
 * 1：使用变量注意事项，如果创建多个变量，变量之间名称不可重复
 * 2：对于float和long类型的字母后缀不能丢掉，不然会默认为double和int类型
 * 3：如果使用byte和short类型的变量，右侧数据范围不能超过左侧的数据范围
 * 4：没有进行赋值的变量不能直接使用
 * 5：变量使用不能超过作用域的范围
 * [作用域]：从定义变量的一行开始，一直到直接所属的大括号结束为止
 **/
public class Demo4VariableNotice {
    public static void main(String[] args) {
        int num1 = 1;  //创建了一个新的变量num1
       // int num1 = 2; 又创建了一个num1，重复定义

        int num2 = 20;
        //System.out.println(num3);不能在变量定义之前使用，先定义后使用
        int num3 ;
        num3 = 30;
        int num4;
        System.out.println(num2);
        System.out.println(num3);
        //System.out.println(num4);没有赋值
        {
            int num6 = 50;
            System.out.println(num6);
            //大括号结束，num6定义结束，作用域失效
        }
        //int num6 = 30;作用域以外可以重复定义，不冲突
        //System.out.println(num6);不能超过作用域，即大括号的范围

        //类型相同可以同时创建
        int a,b,c;
        //分别赋值
        a = 10;
        b = 20;
        c = 30;

        //相同类型同时创建并赋值
        int z = 10,x = 20,v = 30;
    }
}

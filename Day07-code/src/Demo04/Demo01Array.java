package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-29 12:17
 *
 * 数组的缺点：一旦创建，程序运行期间长度不可以发生改变
 **/
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("ty",16);
        Person two = new Person("as",11);
        Person three = new Person("qw",12);

        //将one当中的地址值赋值到0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        //地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[0].getName());
    }

}

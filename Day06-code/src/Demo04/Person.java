package Demo04;

/**
 * @program: basic-code
 * @description:
 * @author: ty
 * @create: 2019-12-19 16:37
 *
 * private 只能在本类中进行访问，超出就不可以了,不能直接访问
 *
 * 间接访问private，就需要定义set/get方法
 *
 * 对于Getter来说，不能有参数，返回值类型和成员变量对应
 * 对于Setter来说，不能有返回值，参数类型和成员变量对应
 **/
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫" + name + ",年龄:" + age);
    }

    //向age设置数据
    public void setAge(int num){
        if(num > 100 && num >=0){
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    //获取age数据
    public int getAge(){
        return age;
    }
}

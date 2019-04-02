package Sequence;
/**
 * @program: OneM
 * @description: if...else if
 * @author: ty
 * @create: 2019-03-17 15:25
 **/
public class Demo04IfElseif {
    public static void main(String[] args) {
        int x = 4;
        int y;
        if(x >= 3){
            y = 2 * x + 1;
        }else if(x > -1 && x > 3){
            y = 2 * x;
        }else{
            y = 2 * x - 1;
        }
        System.out.println("y:" + y);
    }
}

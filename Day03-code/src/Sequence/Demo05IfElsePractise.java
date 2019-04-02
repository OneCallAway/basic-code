package Sequence;

/**
 * @program: OneM
 * @description: 练习
 * @author: ty
 * @create: 2019-03-17 15:35
 *
 * 与 &&  全true为true  有一false 都为false
 * 或 ||  有一true全为true  全false 都为false
 **/
public class Demo05IfElsePractise {
    public static void main(String[] args) {
        int score = 120;
        if(score >= 90 && score <= 100){
            System.out.println("优秀");
        }else if(score >= 80 && score <= 90){
            System.out.println("好");
        }else if(score >= 70 && score <= 80){
            System.out.println("良");
        }else if(score >= 60 && score <= 70){
            System.out.println("及格");
        }else if (score >= 0 && score <60){
            System.out.println("不及格");
        }else {
            System.out.println("数据无效");
        }

//        int score = -1;
//        if (score < 0 || score > 100) {
//            System.out.println("成绩不合理");
//        } else if (score >= 90 && score <= 100) {
//            System.out.println("优秀");
//        } else if (score >= 80 && score <= 90) {
//            System.out.println("好");
//        } else if (score >= 70 && score <= 80) {
//            System.out.println("良");
//        } else if (score >= 60 && score <= 70) {
//            System.out.println("及格");
//        } else {
//            System.out.println("不及格");
//        }
    }
}


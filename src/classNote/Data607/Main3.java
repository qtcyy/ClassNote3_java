package classNote.Data607;

import java.util.Random;

public class Main3 {
    public static void main(String[] args){
        Random rand = new Random();
        int score = rand.nextInt(100);
        System.out.println(score);
        score/=10;
        switch (score){
            case 0,1,2,3,4,5:
                System.out.println("不及格");
                break;
                case 6,7:
                    System.out.println("一般");
                    break;
            case 8:
                System.out.println("良好");
                break;
            case 9,10:
                System.out.println("优秀");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + score);
        }
    }
}

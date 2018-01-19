package game;

import java.util.Arrays;
import java.util.Random;

public class AnswerGenerator {
    public String answer() {
        Random ran = new Random();
        int r = 0;
        m1:while(true){
            int n = ran.nextInt(10000);
            r = n;
            int[] bs=new int[4];
            for(int i=0;i<bs.length;i++){
                bs[i]=n%10;
                n/=10;
            }
            Arrays.sort(bs);
            for(int i=1;i<bs.length;i++){
                if(bs[i-1]==bs[i]){
                    continue m1;
                }
            }
            break;
        }
        String answer = String.valueOf( r );
        return answer;
    }
}

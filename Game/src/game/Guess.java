package game;

import java.util.Scanner;

public class Guess {
    public static void main(String args[]){
        String right = "Congratulations!";
        System.out.println("Welcome!");
        AnswerGenerator answergenerator = new AnswerGenerator();
        String answer = answergenerator.answer();
        System.out.println( answer );
        int i = 6;
        while(i>0)
        {
            System.out.println( "Please input your number(" + i + ")" );
            Scanner in = new Scanner( System.in );
            String input = in.next();
            CompareNumber comparenumber = new CompareNumber();
            String a = comparenumber.compare( answer,input );
            if (i == 1) {
                System.out.println("Game Over");
                break;
            }
            else {
                if(a.equals( "4A0B" ))
                {
                    System.out.println(right);
                    break;
                }
                else
                {
                    i-=1;
                    System.out.println(a);
                }
            }
        }
    }
}

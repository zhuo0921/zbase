package game;

public class CompareNumber {

    public String compare(String answer, String input) {

        int answernumber = 0;
        int inputnumber = 0;
        String con = "";

            char[] answer1 = new char[4];
            char[] input1 = new char[4];
            for(int i=0;i<4;i++)
            {
                answer1[i] = answer.charAt( i );
                input1[i] = input.charAt( i );
            }
            for(int i=0;i<4;i++)
            {
                if(answer1[i] == input1[i])
                    answernumber++;
                else {
                    if(answer.indexOf(String.valueOf(input1[i])) != -1)
                    {
                        inputnumber++;
                    }
                }
            }
            con = answernumber+"A"+inputnumber+"B";
            return con;

    }
}

import java.util.Scanner;

public class BMQuestao7 {
 
    public static void main(String[] args) {
        int X = 13;
        int Y;

        do{
            

            if (X%2 == 0){
                Y = X/2;
                System.out.println(Y);
            }
            else{
                Y = 3 * X + 1;
                System.out.println(Y);
            }

            X = Y;
        }while(Y>1);





    }

}

import java.util.Scanner;
import java.util.Scanner;


public class BMQuestao6 {
    
    public static void main(String[] args) {
        
        int diaSemana;
        
        do{
        Scanner lerDia = new Scanner(System.in);
        diaSemana = lerDia.nextInt();
        
            switch (diaSemana){
                case 1:
                System.out.println("segunda-feira");
                break;
                case 2:
                System.out.println("teça-feira");
                break;
                case 3:
                System.out.println("quarta-feira");
                break;
                case 4:
                System.out.println("quinta-feira");
                break;
                case 5:
                System.out.println("sexta-feira");
                break;
                case 6:
                System.out.println("sábado");
                break;
                case 7:
                System.out.println("domingo");
                break;
            }


        }while(diaSemana != 0);




    }

}

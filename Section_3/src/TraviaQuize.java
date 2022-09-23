import java.util.Scanner;

public class TraviaQuize {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("\nhat is the capital city of Ghana ");
        System.out.println("\ta)Accra \tb)Kumasi \tc)Tamale \td)Sunyani");
        String answer1 = scan.nextLine();

        System.out.println("\n What is the population of the People in Ghana");
        System.out.println("\ta)4 Million \tb)6 Million \tc)2 Million \td)1 Million");
        String answer2 = scan.nextLine();

        System.out.println("\n Which of the Below City is in the Greater Accra of Ghana");
        System.out.println("\ta)Kumasi \tb)Adum \tc)Tema \td)Kasoa");
        String answer3 = scan.nextLine();

        int score = 0;

        if(answer1.equals("a") ){
            score += 5;
        }
        if (answer2.equals("a")){
            score += 5;
        }
        if(answer3.equals("d")){
            score += 5;
        }
        System.out.println(score);
    }

}

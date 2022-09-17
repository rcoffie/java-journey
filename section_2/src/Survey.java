import java.util.Scanner;

public class Survey {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");
        int counter = 0;
        System.out.println("What is your name ");
        String name = scan.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffePrice = scan.nextDouble();
        counter++;

        System.out.println("How much do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;
        System.out.println("How many times a week do you buy coffee ?");
        int foodAmout = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + (name) + "for answering all " + counter + " questions");
        System.out.println("Your fast food expenses are " + (foodPrice/coffePrice) + " times more than your coffee expenses ");




        scan.close();


    }
}

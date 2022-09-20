import java.util.Scanner;
public class WorkBook_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nMe: Hi Do i have enough change to buy chips ");
        double change = scan.nextDouble();
        double chips = 45;
        System.out.println("Java:" + (change >= chips));

        System.out.println("Me: hi Java, can the elevator hold everyone ?");
        int numberOfPeople = scan.nextInt();
        int numberofPeopleForElevator = 30;
        System.out.println("Java:" + (numberOfPeople <= numberofPeopleForElevator));

        System.out.println("\nMe: hi Java, will my friends bey happy ?");
        scan.nextLine();
        String mood = scan.nextLine();
        String happy = "happy";
        System.out.println("\nJava:" + (mood.equals(happy)));

        System.out.println("\nMe: hi Java, can everybody attend my party ?");
        int capacity = 40;
        int numberofInvite = scan.nextInt();

        System.out.println("\nJava:" + (numberofInvite  <= capacity ));

        System.out.println("Me: hi Java, will i win the Vote ?");
        double points = 100;
        double result = scan.nextDouble();
        System.out.println("\nJava:" + (result >= points));









    }
}

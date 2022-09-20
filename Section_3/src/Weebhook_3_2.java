import java.util.Scanner;

public class Weebhook_3_2 {
    public static void main(String [] args){
        int amount = 400;
        int carPrice = 450;
        int nikeShoe = 600;
        System.out.println("\nHi dad can i have a the car ");



        if(amount >= carPrice){


            System.out.println("\nyes, you can have it ");
            int newAmount = amount- carPrice;
            System.out.println("\ncan i get this nike shoe too ?");
            System.out.println("\nSorry i only have " + (newAmount));
        }
        else{
            System.out.println("i don't  have enough money on me ");
        }
    }
}

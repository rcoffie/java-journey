import java.util.Scanner;

public class chatbot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello what's your name ");
        String name = scan.nextLine();

        System.out.println("Hi " + (name) + " am Javabot where are you from  ?");
        String city = scan.nextLine();
        System.out.println("\nI hear is a beautiful place in " + (city) + " am also from a place call Oracle");

        System.out.println("\nHow old are you ");
        int age = scan.nextInt();
        int javaAge = 400;

        System.out.println("\nso you are " + (age) + " Cool! am  " + (javaAge) + " years");
        System.out.println("\nmeaning am " + (javaAge-age) + " years older than you" + " making me " + (javaAge/age) + " times older than you " );


        System.out.println("\nWhats your favorite language please don't say python ");
        scan.nextLine();
        String language = scan.nextLine();

        System.out.println("\n" + language + " ! that's great  nice chatting with you " + (name) + " i have to log off now see ya!");



    }
}

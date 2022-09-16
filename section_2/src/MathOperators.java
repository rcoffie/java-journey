public class MathOperators {
    public static void main(String[] args){
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long startInMilkyWay = 25000000L;
        long startInAndromeda = 1000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

//        + plus method

        System.out.println(bagOfSweets1 + bagOfSweets2);
        System.out.println(startInMilkyWay + startInAndromeda);
        System.out.println(testScore + bonusMarks);

        System.out.println("Fred and George collected" + ( bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + ( startInMilkyWay + startInAndromeda) + "stars in Milky way ");
        System.out.println("With bonus marks, Ron Scored " + (testScore + bonusMarks) + "/ 10 on his position ");


//        - subtracts two operator
        System.out.println(bagOfSweets2 - bagOfSweets1);
        System.out.println(startInAndromeda - startInMilkyWay);
        System.out.println(testScore - bonusMarks);

        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweet than George ");
        System.out.println("The Andromeda Galaxy has " + (startInAndromeda - startInMilkyWay) + " more stars than the Milky way");
        System.out.println("Snape ended up removing marks. Ron actually scored " + ( testScore - bonusMarks) + "on his potion test");

//        * Operator
        System.out.println(bagOfSweets1 * bagOfSweets2);
        System.out.println(testScore*bonusMarks);

        System.out.println("Special spell to multiply their sweet to: " + (bagOfSweets1*bagOfSweets2));
        System.out.println("excel, accidentally multiplying Ron's score to:" + (testScore*bonusMarks)+ "/10");

//        Division Operator
        System.out.println(bagOfSweets2/bagOfSweets1);
        System.out.println(startInAndromeda/startInMilkyWay);
        System.out.println(testScore/bonusMarks);

        System.out.println("Originally, Fred had " + ( bagOfSweets2/bagOfSweets1 )+ " times more sweets than George");
        System.out.println( " Andromeda has " + (startInAndromeda/startInMilkyWay) + "times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's Score to:" + (testScore/bonusMarks) + "testScore/bonusMarks" );


//        % Operator

        System.out.println("10 is an even number, since dividing 10 by 2 has a reminder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a reminder of:" + (5 % 2));

//        ++ Operator increase the value by one

        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("I count: " + (counter));

        counter--;
        counter--;
        counter--;
        System.out.println("I count: " + ( counter));

//        -= Operator











    }
}

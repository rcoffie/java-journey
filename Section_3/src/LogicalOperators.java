public class LogicalOperators {
    public static void main(String[] args){
        int chemistryGrade = 67;
        int englishGrade = 65;

        if (chemistryGrade > 75 || englishGrade > 75 ){
            System.out.println("you got the scholarship");
        }else{
            System.out.println("you didn't get the scholarship ");
        }
        int credits = 56;
        double GPA = 3.2;
        if (credits >=40 && GPA >=2.0){
            System.out.println("you earned your diploma!");

        }else {
            System.out.println("Sorry, you need at least 40 credit and a minimum of 2.0 GPA");
        }
    }
}

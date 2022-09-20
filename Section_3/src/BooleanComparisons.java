public class BooleanComparisons  {
    public static void main(String[] args){


//        working with Greater than comparison >
        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("grater than comparison ");
        System.out.println(biologyGrade > chemistryGrade);

        double sales = 37.55;
        double costs = 5.55;

        System.out.println(sales > costs);

//        less than comparison <
        int mathematicsGrade = 89;
        int economicsGrade = 97;
        System.out.println("\nless than comparison");
        System.out.println(economicsGrade < mathematicsGrade);

        double discount = 30.7;
        double profit = 45.9;

        System.out.println(discount < profit);

//        greater than or equal to >=

        int artGrade = 88;
        int englishGrade = 90;
        int geographyGrade = 88;

        System.out.println("\nshowing grater than or equal to operators ");
        System.out.println(artGrade >= geographyGrade);
        System.out.println(englishGrade >= artGrade);
        System.out.println(geographyGrade >= englishGrade);
//
//        using less than or equal to <=

        int vocationalSkillGrade = 99;
        int medicineGrade = 80;
        int beauticianGrade = 90;

        System.out.println("\nshowing less than or equal to operators  ");
        System.out.println( vocationalSkillGrade <= beauticianGrade);
        System.out.println(medicineGrade <= vocationalSkillGrade);

//        using the equal operator
        int dancingGrade = 88;
        int musicGrade = 85;
        int cultureGrade = 88;

        System.out.println("\nEqual to operator ");
        System.out.println(dancingGrade == musicGrade);
        System.out.println(dancingGrade == cultureGrade);

//        not equal comparison !=
        int urbanArtGrade = 89;
        int ruralArtGrade = 89;
        int environmentArtGrade = 80;

        System.out.println("\n not equal to operators comparison");
        System.out.println(urbanArtGrade != ruralArtGrade);
        System.out.println(urbanArtGrade != environmentArtGrade);

//        equal method  this is use to check strings  string.equalS(string)

        String firstStudent = "Ama Johnson";
        String secondStudent = "Ama Johnson";
        String thirdStudent = "Yaa Johnson";

        System.out.println("\nequals method on string ");
        System.out.println(firstStudent.equals(secondStudent));
        System.out.println(firstStudent.equals(thirdStudent));

//        !equals method on Strings  string.!equals(String)

        String mathsTeacher = "Eric Doe";
        String englishTeacher = "Eric Doe";
        String frenchTeacher = "Simon Jackson";

        System.out.println("\n!equals method on string");
        System.out.println(!mathsTeacher.equals(englishTeacher));
        System.out.println(!mathsTeacher.equals(frenchTeacher));





    }
}

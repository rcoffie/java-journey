import java.util.Arrays;

public class ReferenceType {
    public static void main(String [] args){
        String[] staffLastYear = {"Tommy","Joel","Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
//        for (int i = 0; i < staffThisYear.length; i ++){
//            staffThisYear[i] = staffLastYear[i];
//
//        }

        staffThisYear[1] = "Law gee";
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));


    }
}

import java.util.Arrays;
public class TDarrays {
    public static void main(String [] args){
        int[][] grades = new int[3][4];
//        Harry
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 80;
//        Ron
        grades[1][0] = 77;
        grades[1][1] = 87;
        grades[1][2] = 80;
        grades[1][3] = 80;

//        Hermonie
        System.out.println("\tHarry; " + Arrays.toString(grades[0]));
        System.out.println("\tRon;"+ Arrays.toString(grades[1]));
        System.out.println("\tHermonie;" + Arrays.toString(grades[2]));

    }
}

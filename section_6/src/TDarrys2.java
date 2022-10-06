import java.util.Arrays;

public class TDarrys2 {
    public static void main(String [] args){
        int[][] grades = {
                {72,74,78,76},
                {80,80,72,79},
                {82,84,68,86},
        };

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon " + Arrays.toString(grades[1]));
        System.out.println("\tHermione " + Arrays.toString(grades[2]));
    }
}

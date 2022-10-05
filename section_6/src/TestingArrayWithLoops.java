import java.util.Arrays;


public class TestingArrayWithLoops {
    public static void main(String[] args){
        String[] menu = {"books", "Chair", "Chalk", "Board", "Table"};
        System.out.println(menu[0]);
        String stringMenu = Arrays.toString(menu);
        String[] newMenu = new String[8];
        System.out.println(stringMenu);

        for (int i = 0; i < menu.length; i++ ){
            newMenu[i] = menu[i];

            System.out.println("this are the list of Menu served at the cafe " + " " + i + " " + menu[i]);

        }
        String newMenu1 = Arrays.toString(newMenu);
        System.out.println(newMenu1);
        newMenu[6] = "Bucket";
        newMenu[7] = "Basket";
        System.out.println(Arrays.toString(newMenu));
    }
}

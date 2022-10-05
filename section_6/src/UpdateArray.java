import java.util.Arrays;


public class UpdateArray {
    public static void main(String [] args ){
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
//        updating the array
        menu[2] = "Latte";
        String menuString = Arrays.toString(menu);
        String[] newMenu = new String[5];
        for (int i = 0; i < menu.length; i++ ){
            newMenu[i] = menu[i];


        }
        newMenu[3] = "dark coffie";
        newMenu[4] = "Icy milk Coffee";
        System.out.println(Arrays.toString(newMenu));

    }
}

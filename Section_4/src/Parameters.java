public class Parameters {
    public static void main(String[] args){

        measureRectangle(56, 56);
        measureRectangle(4.7, 56.1);

    }

    public static void measureRectangle(double height , double width){
       double area = height * width ;
        System.out.println(" the area of " + height + " and " + width + " equal " + area + "\n" );
    }
}

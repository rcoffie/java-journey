public class ReturnValue {

    public static void main (String [] args){

       double measure1 =  measureRectangle(34, 56);
       double measure2 = measureRectangle(3.4, 34.0);
       double measure3 = measureRectangle(66, 45);
       double measure4 = measureRectangle(87, 99);

       stringPrinter(34, 56, measure1);
       stringPrinter(3.4, 34.0, measure2);
       stringPrinter(66, 45, measure3);
       stringPrinter(87,99, measure4);





    }

    public static double measureRectangle(double height, double width ){
       double area = height * width ;
        return area ;
    }

    public static void stringPrinter(double length, double width, double area){
        System.out.println("The area of a rectangle with the length " + length + "and width " + width + "is equal " + area + "\n");
    }
}

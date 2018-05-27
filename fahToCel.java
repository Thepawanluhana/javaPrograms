import java.util.*;

class fahToCel{
    public static void main(String args[]){
        float fah;
        double cel;
        System.out.println("Please enter temperature in Farenheit:" );
        
        Scanner in = new Scanner(System.in);
        fah = in.nextInt();

        System.out.println("Temperature in Farenheit: " +fah);

        cel = (fah-32)/1.8;

        System.out.println("Temperature in Celcius: " +cel);
    }
}
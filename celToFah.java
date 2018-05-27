import java.util.*;

class celToFah{
    public static void main(String args[]){
        float cel;
        double fah;

        System.out.println("Enter temperature in Celcius: ");

        Scanner in = new Scanner(System.in);
        cel = in.nextInt();

        System.out.println("Temperature in Celcius: " +cel);

        fah = (1.8*cel)+32;

        System.out.println("Temperature in Farenheit: " +fah);
    }
}
import java.util.*;
class reverseNumber{
    public static void main(String args[]){
        int num=0, rnum=0;

        System.out.println("Please enter a number:");

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        System.out.println("Entered number is "+num);

        while(num != 0){
            rnum = rnum*10;
            rnum = rnum+num%10;
            num = num/10;
        }
        System.out.println("Reverse of entered number is: " +rnum);
    }
}
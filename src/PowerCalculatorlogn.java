import java.util.Scanner;

public class PowerCalculatorlogn {

    static int powerCalc(int base,int pow){

        //Base Case
        if(base==0){
            return 0;
        }if(pow==0){
            return 1;
        }

        //Recursion
        if(pow%2==0){

            return powerCalc(base,pow/2)*powerCalc(base,pow/2);
        }
        else {
            return powerCalc(base,pow/2)*powerCalc(base,pow/2)*base;
        }

    }


    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base Number:");

        int x = sc.nextInt();

        System.out.println("Enter the Power of Base Number:");

        int pow = sc.nextInt();

        System.out.println("Your Result is:");

        System.out.println(powerCalc(x,pow));

    }
}

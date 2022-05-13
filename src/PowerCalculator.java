
import java.util.Scanner;

public class PowerCalculator {

    static int PowerCalc(int x,int pow){

        if(pow==0){//Base Case 1
            return 1;
        }

        if(x==0){//Base Case 2
            return 0;
        }

        int xPownm1 = PowerCalc(x,pow-1);//Recursion
        int xPown = x*xPownm1;

        return xPown;
    }

    public static void main(String[]args){

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base Number:");

       int x = sc.nextInt();

        System.out.println("Enter the Power of Base Number:");

       int pow = sc.nextInt();

        System.out.println("Your Result is:");

        System.out.println(PowerCalc(x,pow));


        //Original Method
//        int n = 2,pow=3,sum =1;
//
//        for( int i=1;i<=pow;i++){
//
//            sum *= n;
//
//        }
//        System.out.println(sum);
//        output
//        2*2*2 = 8

    }
}

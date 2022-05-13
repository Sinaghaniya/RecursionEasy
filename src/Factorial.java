public class Factorial {

    static int PrintFactorial(int n){

        if(n==1||n==0){//BASE CASE
            return 1;
        }

        int fact_nm1 = PrintFactorial(n-1);//Decreasing the value of n by 1 == 3-2-1;
        int fact_n = n * fact_nm1;//Multiplying n X fact_nm1 ie 3*2*1 = 6

        return fact_n;

    }

    public static void main(String[]args){

        int n = 3;

        System.out.println(PrintFactorial(n));


//        int sum =1;
//
//        for(int i=3;i>=1;i--){
//
//            sum *=i;
//
//        }
//
//        System.out.println(sum);

    }
}

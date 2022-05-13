
public class PrintNumbersfrom5to1 {

    static void printNumb(int n){//Recursion Method
        //Base Case
        if(n==0){
            return;
        }
        //Printing the Output
        System.out.println(n);
        //Recursion
        printNumb(n-1);
        /**Why we use n-1
         * because we are decreasing the value
         * from 5
         *      4
         *      3
         *      2
         *      1
         * ie 5-1,
         * 4-1,
         * 3-1,
         * 2-1,
         * 1-1,
         * 0 end of the Statement
         */

    }

    public static void main(String[]args){


        int n = 5;

        printNumb(5);//Recursion Method

        //Our Method
//        int n = 5;
//
//        for(int i = n;i>=1;i--){
//
//            System.out.println(i);
//        }

    }
}

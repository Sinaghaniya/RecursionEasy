public class FizzBuzzInRecursion {

    static void PrintFizzandBuzz(int n){

        if(n==101){
            return;//Base Case
        }

        if(n%3==0 && n%5==0){//Printing the Output
            System.out.println("FizzandBuzz");
        }else if(n%3==0){
            System.out.println("Fizz");
        }else if(n%5==0){
            System.out.println("Buzz");
        }else {
            System.out.println(n);
        }

        PrintFizzandBuzz(n+1);//Recursion

    }

    public static void main(String[]args){

        int n = 1;

        PrintFizzandBuzz(n);

//        for(int i=1;i<=n;i++){ //Original Method
//
//            if(i%3==0 && i%5==0){
//                System.out.println("FizzAndBuzz");
//            }else if(i%3==0){
//                System.out.println("Fizz");
//            }else if(i%5==0){
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }

    }
}

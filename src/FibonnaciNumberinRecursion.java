public class FibonnaciNumberinRecursion {

    static void printFib(int a,int b,int n){

        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }

    public static void main(String[]args){

        int a = 0,b=1;

        System.out.println(a);
        System.out.println(b);

        int n = 10  ;

        printFib(a,b,n-2);

          //Original Method

//        int a=0,b=1,c=0;
//
//        System.out.println(a);
//
//        System.out.println(b);
//
//        for(int i=1;i<=10;i++){
//
//            c = a+b;
//
//            System.out.println(c);
//
//            a = b;
//
//            b = c;
//
//        }

        //Fibonacci Numbers = 0 1 1 2 3 5 8 13 21 34 55 89;
        // till 10
    }
}

public class SumofFirstNaturalNumbers {

    static void printSumOFNaturalNum(int i,int n,int sum){

        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }


        sum+=i;

        printSumOFNaturalNum(i+1,n,sum);



    }

    public static void main(String[]args){

       printSumOFNaturalNum(1,10,0);

//        int sum = 0;
//
//        for(int i=1;i<=n;i++){
//
//            sum+=i;
//        }
//
//        System.out.println(sum);

        //1 2 3 4 5 6 7 8 9 10 = 55
    }
}

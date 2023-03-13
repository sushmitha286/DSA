import java.util.Scanner;
class Countnumofsetbit{
static int Kernighansalgo(int n){
   int count =0;
    while(n>0){
         n = n&(n-1);
         count = count + 1;
    }
    return count;
}

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Kernighansalgo(n));
    }
}
// alogirithm
/*
step 1: The right most set become unset
step 2: all the bits from left side remian  unchanged
step 3: all the bits from right side become zero.
*/


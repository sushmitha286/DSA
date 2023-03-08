import java.util.Scanner;
class trailingzero{
    static int trailing(int n){
        int res = 0;
        int powOf5 = 5;
        while(n>=powOf5){
            res = res + (n/powOf5);
            powOf5 = powOf5 * 5;
        }
        return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailing(n));

    }
}
/*
input:25
o/p : 6
explanation: trailing zero means the zero which occur at the end of the total factorial  result.
5! = 1*2*3*4*5 = 120 : the 1 zero which occur at the end this is called trailing zero.

so depends on the 5 , the total amount of 5 present in the factorial of a number that much of zeros present 
ate the end.

step 1: the number shuld be greater then or equal to powerof5
   while(n>=powof5)

step 2:the beginning res = 0 , 
  res = res + (n/powof5)

step 3: the power is increases which is multiple of 5 
   powof5 = powof5*5
*/

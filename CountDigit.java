import java.util.Scanner;
class CountDigit{
    static int countdigit(int n){
        int count = 0;
        while(n>0){
        n = n/10;
        count = count + 1;
        }
        return count;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countdigit(n));
    }
}
/* input : 2 4 5 7
output : 4
algorithm:
step 1: check if digit exist
      n > 0
step 2: remove last digit
   n = n/10      
   2459 / 10 = 245
   245 / 10 = 24
   24  / 10 = 2
   2 /10 = 0
step 3: increase the count by 1
      count = count + 1;
step 4: repeat step from 1 to 3 untill digit remain.
*/

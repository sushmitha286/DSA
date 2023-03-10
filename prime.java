// import java.util.Scanner;
// class prime{
//     static boolean primenum(int n){
//         for(int i = 2;i<=n/2;i++){//int i = 2 to i <=Math.sqrt(n)
//             if(n%i == 0){
//                 return false;
//             }
        
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(primenum(n));
//     }
// }
import java.util.Scanner;
class prime{
    static boolean primenum(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n == 3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i = 5;i<=Math.sqrt(n);i=i+2){
            if(n%i==0|| n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primenum(n));
    }
}

